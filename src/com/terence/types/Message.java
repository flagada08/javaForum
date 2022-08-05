package com.terence.types;

import java.text.DateFormat;
import java.util.Date;

public class Message {
	private String titre;
	private String texte;
	private Date dateCreation;
	private Utilisateur utilisateur;
	
	public Message(String pTitre, String pTexte, Utilisateur pUtilisateur) {
		titre = pTitre;
		texte = pTexte;
		utilisateur = pUtilisateur;
		dateCreation = new Date();
	}

	@Override
	public String toString() {
		return "Message [" 
				+ titre + " -- " 
				+ texte + "\nDate de création : " + getDateCreation() + "\n"
				+ utilisateur + "]";
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDateCreation() {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		return df.format(dateCreation);
	}

//	public void setDateCreation(Date dateCreation) {
//		this.dateCreation = dateCreation;
//	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

//	public void setUtilisateur(Utilisateur utilisateur) {
//		this.utilisateur = utilisateur;
//	}
}
