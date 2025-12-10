package com.example.doctorat.gestion.service;


import com.example.doctorat.gestion.model.candidat.Candidat;
import com.example.doctorat.gestion.model.candidat.Diplome;
import com.example.doctorat.gestion.model.candidat.Notification;
import com.example.doctorat.gestion.model.candidat.Postuler;
import com.example.doctorat.gestion.repository.CandidatRepository;
import com.example.doctorat.gestion.repository.DiplomeRepository;
import com.example.doctorat.gestion.repository.NotificationRepository;
import com.example.doctorat.gestion.repository.PostulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    CandidatRepository candidatRepository;
    DiplomeRepository diplomeRepository;
    PostulerRepository postulerRepository;
    NotificationRepository notificationRepository;


   // Compléter les informations de Candidat
    public Candidat addCandiatInformation(Candidat candidat){
        return candidatRepository.save(candidat);
    }
    // Ajouter les informations
    public Diplome addCandidatDiplome(Diplome diplome){
        return diplomeRepository.save(diplome);
    }


    public Postuler choiseSujet(Postuler postuler){
        return postulerRepository.save(postuler);
    }

    public List<Notification> getNofication(){
        return notificationRepository.findAll();
    }


}
