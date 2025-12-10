package com.example.doctorat.gestion.model.professeur;

import java.time.LocalDate; 

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
@Table(name = "professeur_formationdoctorale")
@Data
public class FormationDoctorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String initiale;
    
    @Column(length = 255)
    private String titre;
    
    
    @Column(name = "path_image", length = 255)
    private String pathImage; 

    @Column(name = "axe_de_recherche", length = 255)
    private String axeDeRecherche;

    @Column(name = "date_accreditation")
    private LocalDate dateAccreditation; 
   
    @ManyToOne @JoinColumn(name = "ced_id")
    private Ced ced; 
    
    @ManyToOne @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;
}