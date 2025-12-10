package com.example.doctorat.gestion.model.professeur;

import java.time.LocalDate;

import com.example.doctorat.gestion.model.candidat.Candidat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "professeur_inscription")
@Data
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_dipose_dossier") 
    private LocalDate dateDiposeDossier;
    
    @Column(length = 500) 
    private String remarque;
    
    @Column
    private Boolean valider = false;
        
    @OneToOne @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @ManyToOne @JoinColumn(name = "sujet_id", nullable = false) 
    private Sujet sujet;
}