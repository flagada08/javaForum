package com.terence.types;
public class Utilisateur {
	private String nom;
	private String prenom;
	private CategorieUtilisateur statut;
	
	public Utilisateur() {
		
	}
	
	@Override
	public String toString() {
		return "Utilisateur: " + prenom + " " + nom + ", " + statut;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public CategorieUtilisateur getStatut() {
		return statut;
	}
	public void setStatut(CategorieUtilisateur statut) {
		this.statut = statut;
	}
}
