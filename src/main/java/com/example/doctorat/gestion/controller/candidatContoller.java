package com.example.doctorat.gestion.controller;

import com.example.doctorat.gestion.model.auth.User;
import com.example.doctorat.gestion.model.candidat.Candidat;
import com.example.doctorat.gestion.model.candidat.Diplome;
import com.example.doctorat.gestion.model.candidat.Notification;
import com.example.doctorat.gestion.model.candidat.Postuler;
import com.example.doctorat.gestion.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidats")
public class candidatContoller {

    @Autowired
    private CandidatService candidatServices;



    @PostMapping("/complteInformation")
    public Candidat ajoutertoutInformationResonnel(@RequestBody Candidat candidat){
        return candidatServices.addCandiatInformation(candidat);
    }

    @PostMapping("/addCarrer")
    public Diplome ajouterParcourProfessionnel(@RequestBody Diplome diplome){
      return candidatServices.addCandidatDiplome(diplome);
    }

    @PostMapping("/choiseSujet")
    public Postuler choixSujet(@RequestBody Postuler postuler){
        return candidatServices.choiseSujet(postuler);
    }

    @GetMapping("/notification")
    public Notification notifation(@RequestBody Notification notification){
        return candidatServices.getNofication(notification);
    }

}
