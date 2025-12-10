package com.example.doctorat.gestion.repository;


import com.example.doctorat.gestion.model.candidat.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}
