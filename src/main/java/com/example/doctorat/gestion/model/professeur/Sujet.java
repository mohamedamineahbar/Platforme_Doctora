package com.example.doctorat.gestion.model.professeur;

import java.util.List;

import com.example.doctorat.gestion.model.candidat.Postuler;

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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "professeur_sujet")
@Data
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String titre;
    
    
    @Column(length = 1000)
    private String description; 

    @Column
    private Boolean publier = false; 
    
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professeur_id", nullable = false) 
    private Professeur encadrant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "co_directeur_id")
    private Professeur coDirecteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formation_doctorale_id", nullable = false)
    private FormationDoctorale formationDoctorale;
    
    @OneToMany(mappedBy = "sujet", cascade = CascadeType.ALL)
    private List<Postuler> postulations;
}