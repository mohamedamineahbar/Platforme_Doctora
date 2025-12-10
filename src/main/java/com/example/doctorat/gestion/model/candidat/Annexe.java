package com.example.doctorat.gestion.model.candidat;

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
@Table(name = "candidat_annexe")
@Data
public class Annexe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path_file", nullable = false, length = 255) 
    private String pathFile; 

    @Column(length = 255)
    private String titre;
    
  
    @Column(name = "type_annexe", length = 50) 
    private String typeAnnexe; 
    
    @ManyToOne
    @JoinColumn(name = "diplome_id", nullable = false)
    private Diplome diplome;
}