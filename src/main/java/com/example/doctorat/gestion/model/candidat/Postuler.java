package com.example.doctorat.gestion.model.candidat;

import com.example.doctorat.gestion.model.professeur.Sujet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "candidat_postuler")
@Data
public class Postuler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String pathFile;
    
   
    @ManyToOne @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @ManyToOne @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;
}