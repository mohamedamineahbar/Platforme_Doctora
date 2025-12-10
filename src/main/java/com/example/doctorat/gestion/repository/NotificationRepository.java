package com.example.doctorat.gestion.repository;

import com.example.doctorat.gestion.model.candidat.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification , Long> {
}
