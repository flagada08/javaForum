package com.terence.types;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Utilisateur {
	private String nom;
	private String prenom;
	private CategorieUtilisateur statut;

	public Utilisateur(String pPrenom, String pNom, CategorieUtilisateur pStandard) {
		nom = pNom;
		prenom = pPrenom;
		statut = pStandard;
	}

	public static void afficher(Utilisateur pUtilisateur) {
		showMessageDialog(null, pUtilisateur.toString(), pUtilisateur.getPrenom(), INFORMATION_MESSAGE);

	}

	@Override
	public String toString() {
		return "Utilisateur : " + prenom + " " + nom + ", " + statut;
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
