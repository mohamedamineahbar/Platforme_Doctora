package com.example.doctorat.gestion.repository;

import com.example.doctorat.gestion.model.candidat.Diplome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiplomeRepository extends JpaRepository<Diplome , Long> {
}
