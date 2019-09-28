package com.mproduits.dao;

import com.mproduits.model.Compte;
import com.mproduits.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteDao extends JpaRepository<Compte, Integer>{
	
	    Compte findById(int id);	    
	   	    
	   
	    
	   
	}

