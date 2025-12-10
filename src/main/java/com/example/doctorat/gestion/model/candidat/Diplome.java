package com.example.doctorat.gestion.model.candidat;

import java.time.LocalDate; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "candidat_diplome")
@Data
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String intitule;
    @Column(length = 255)
    private String type;
    @Column(length = 255)
    private String mention;
    
    
    @Column(name = "date_commission")
    private LocalDate dateCommission; 

    @Column(length = 100)
    private String pays;

    @Column(length = 255)
    private String etablissement;

    @Column(length = 255)
    private String specialite;
    
    @Column(length = 100)
    private String ville;
    
    @Column(length = 100)
    private String province;
    
    @Column(name = "moyen_generale")
    private Double moyenGenerale; 

   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;
}