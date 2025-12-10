package com.example.doctorat.gestion.model.professeur;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "professeur_ced")
@Data
public class Ced {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String initiale;
    
    @Column(length = 255)
    private String titre;
    
    @Column(length = 255)
    private String description;
    
    @Column(name = "path_image", length = 255)
    private String pathImage; 
    
    @ManyToOne @JoinColumn(name = "directeur_id", nullable = false)
    private Professeur directeur;
}