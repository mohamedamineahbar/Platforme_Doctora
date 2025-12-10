package com.example.doctorat.gestion.model.professeur;

import com.example.doctorat.gestion.model.candidat.Candidat;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "professeur_examiner")
@Data
public class Examiner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 50)
    private String decision;
    
    @Column(name = "note_dossier")
    private Double noteDossier;
    
    @Column(name = "note_entretien")
    private Double noteEntretien;
    
    @Column
    private Boolean publier = false;

    @Column
    private Boolean valider = false;
    
    
    @ManyToOne @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;
    
    @ManyToOne @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;
    
    @ManyToOne @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;
}