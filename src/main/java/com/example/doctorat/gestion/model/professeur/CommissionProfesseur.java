package com.example.doctorat.gestion.model.professeur;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "professeur_commission_professeurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommissionProfesseur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
  
    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;
    
    @ManyToOne
    @JoinColumn(name = "professeur_id", nullable = false)
    private Professeur professeur;
}