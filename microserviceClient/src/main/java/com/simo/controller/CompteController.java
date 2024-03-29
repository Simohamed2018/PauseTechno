package com.simo.controller;


import com.simo.model.Compte;
import com.simo.proxy.MicroserviceComptesProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController

public class CompteController {

    @Autowired
    private MicroserviceComptesProxy compteProxy;  
   
    @GetMapping("/comptes")
    public List<Compte> getAllComptes(){

       List<Compte> comptes =  compteProxy.listeDesComptes();
	return comptes;       
    }   
   
    
    @GetMapping(value= "/comptes/{id}")
    public Compte detailCompte(@PathVariable int id){

     Compte compte = compteProxy.recupererUnCompte(id);
	return compte;
        
    }
    
    @PostMapping(value = "/comptes")
    public Compte ajouterCompte(@RequestBody Compte compte){

     return  compteProxy.ajouterCompte(compte);
	
        
    }

        
}
