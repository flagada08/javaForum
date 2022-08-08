package com.terence.types;

public class MessageUtilisateur {
	private Utilisateur utilisateur;
	private Message message;
	/**
	 * @param utilisateur
	 * @param message
	 */
	public MessageUtilisateur(Utilisateur pUtilisateur, Message pMessage) {
		//		super();
		this.utilisateur = pUtilisateur;
		this.message = pMessage;
	}

	public String getAuteur() {
		return utilisateur.getPrenom() 
				+ " " 
				+ utilisateur.getNom() 
				+ ", " 
				+ utilisateur.getStatut();
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;		
	}

	public Message getMessage() {
		return message;
	}

}
