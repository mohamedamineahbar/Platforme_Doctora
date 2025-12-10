package com.example.doctorat.gestion.model.professeur;

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
@Table(name = "professeur_laboratoire")
@Data
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nom_laboratoire", nullable = false, length = 255)
    private String nomLaboratoire; 

    @Column(length = 500)
    private String description; 
    
    @Column(name = "path_image", length = 255)
    private String pathImage; 

    @Column(length = 50)
    private String initial; 

   
    @ManyToOne @JoinColumn(name = "directeur_id", nullable = false)
    private Professeur directeur; 

  
    @ManyToOne @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;
    
    @ManyToOne @JoinColumn(name = "ced_id")
    private Ced ced; 
}