package com.example.doctorat.gestion.model.candidat;

import java.time.LocalDate;
import java.util.List;

import com.example.doctorat.gestion.model.auth.User;
import com.example.doctorat.gestion.model.professeur.Examiner;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne; 
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "candidat_candidat")
@Data
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String cin;

    @Column(unique = true, length = 30)
    private String cne;

    @Column(name = "nom_candidat_ar", length = 150)
    private String nomCandidatAr;

    @Column(name = "prenom_candidat_ar", length = 150)
    private String prenomCandidatAr;

    @Column(length = 255)
    private String adresse;

    @Column(name = "adresse_ar", length = 255)
    private String adresseAr;

    @Column(length = 10)
    private String sexe;

    @Column(name = "ville_de_naissance", length = 100)
    private String villeDeNaissance;

    @Column(name = "ville_de_naissance_ar", length = 100)
    private String villeDeNaissanceAr;

    @Column(length = 100)
    private String ville;
    
    @Column(name = "date_de_naissance")
    private LocalDate dateDeNaissance;

    @Column(name = "type_de_handicape", length = 50)
    private String typeDeHandiCape;

    @Column(length = 150)
    private String academie;

    @Column(name = "tel_candidat", length = 20)
    private String telCandidat;

    @Column(name = "path_cv", length = 255)
    private String pathCv;

    @Column(name = "path_photo", length = 255)
    private String pathPhoto;

    @Column(name = "etat_dossier", length = 50)
    private String etatDossier;
    
    @Column(name = "situation_familiale", length = 50)
    private String situationFamiliale;

    @Column(name = "fonctionaire")
    private Boolean fonctionaire; 

    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private User user;

   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pays_id", nullable = false)
    private Pays pays; 

    
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Diplome> diplomes;

    
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Postuler> postulations;

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Examiner> evaluationsRecues;
}