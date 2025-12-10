package com.example.doctorat.gestion.repository;

import com.example.doctorat.gestion.model.candidat.Postuler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostulerRepository extends JpaRepository<Postuler , Long> {
}
