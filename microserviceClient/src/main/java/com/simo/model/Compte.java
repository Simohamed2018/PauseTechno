package com.simo.model;

public class Compte {

	private int id;
	private String detenteur;
	private String banque;
	private String compte;	
	private Double solde;

	public Compte() {

	}

	public Compte(int id, String detenteur, String banque, String compte, Double solde) {
		super();
		this.id = id;
		this.detenteur = detenteur;
		this.banque = banque;
		this.compte = compte;
		this.solde = solde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetenteur() {
		return detenteur;
	}

	public void setDetenteur(String detenteur) {
		this.detenteur = detenteur;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", detenteur=" + detenteur + ", banque=" + banque + ", compte=" + compte
				+ ", solde=" + solde + "]";
	}

	
}
