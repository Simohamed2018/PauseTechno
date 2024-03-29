package com.simo.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.simo.model.Compte;

import java.util.List;


@FeignClient(name = "microservice-compte", url = "localhost:9002")
public interface MicroserviceComptesProxy {

    @GetMapping(value = "/comptes",consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Compte> listeDesComptes();

    /*
    * Notez ici la notation @PathVariable("id") qui est différente de celle qu'on utlise dans le contrôleur
    **/
    @GetMapping( value = "/comptes/{id}")
    Compte recupererUnCompte(@PathVariable("id") int id);
    
    @PostMapping(value = "/comptes",consumes = MediaType.APPLICATION_JSON_VALUE)
    Compte ajouterCompte(@RequestBody Compte compte);



}
