package com.example.doctorat.gestion.model.professeur;

import java.time.LocalDate;
import java.time.LocalTime; 
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne; 
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "professeur_commission")
@Data
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "date_commission")
    private LocalDate dateCommission;

    @Column(length = 255)
    private String lieu;

    @Column(length = 50)
    private LocalTime heure;
    
    @ManyToOne
    @JoinColumn(name = "labo_id", nullable = false)
    private Laboratoire labo; 

   
    @OneToMany(mappedBy = "commission", cascade = CascadeType.ALL)
    private List<Examiner> evaluations;
    
    @OneToMany(mappedBy = "commission", cascade = CascadeType.ALL)
    private List<CommissionProfesseur> membres; 
}