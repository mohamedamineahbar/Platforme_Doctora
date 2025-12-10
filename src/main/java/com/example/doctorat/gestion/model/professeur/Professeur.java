package com.example.doctorat.gestion.model.professeur;

import java.util.List;

import com.example.doctorat.gestion.model.auth.User;

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
@Table(name = "professeur_professeur")
@Data
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(unique = true, length = 30)
    private String cin; 
    @Column(name = "tel_professeur", length = 20)
    private String telProfesseur;
    
    @Column(name = "path_photo", length = 255)
    private String pathPhoto;
    @Column(length = 50)
    private String grade;

    @Column(name = "num_som", unique = true, length = 50) 
    private String numSOM;

    @Column(name = "nombre_encadrer")
    private Integer nombreEncadrer = 0; 

    @Column(name = "nombre_proposer")
    private Integer nombreProposer = 0; 

  
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "labo_id")
    private Laboratoire labo;

    @OneToMany(mappedBy = "encadrant") 
    private List<Sujet> sujetsEncadres;
    
    @OneToMany(mappedBy = "professeur", cascade = CascadeType.ALL)
    private List<CommissionProfesseur> commissionsMembre; 
}