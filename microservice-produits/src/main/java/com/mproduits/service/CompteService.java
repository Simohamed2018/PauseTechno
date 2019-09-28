package com.mproduits.service;

import com.mproduits.model.Compte;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public interface CompteService {


    List<Compte> listeDesComptes();

    Compte recupererUnCompte(int id);

    Compte ajouterUnCompte(Compte produit);

    void supprimerCompte(int id);    

    Compte ajouterCompte(Compte product);

   
}
