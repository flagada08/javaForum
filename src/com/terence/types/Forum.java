package com.terence.types;

import javax.swing.JOptionPane;

public class Forum {
	private final int NBR_MESSAGES = 10;
	private int NBR_MESSAGES_ACTUELS;
	private MessageUtilisateur[] messages;
	/**
	 * @param jean 
	 * @param string2 
	 * @param string 
	 * @param p_NBR_MESSAGES_ACTUELS
	 * @param pMessages
	 */
	public Forum(/**int p_NBR_MESSAGES_ACTUELS, MessageUtilisateur[] pMessages*/) {
//		super();
//		NBR_MESSAGES_ACTUELS = p_NBR_MESSAGES_ACTUELS;
//		messages = pMessages;
		this.messages = new MessageUtilisateur[NBR_MESSAGES];
	}
	public boolean ajouterUtilisateurMessages(Utilisateur pUtilisateur , Message pMessage) {
		try {
			if(NBR_MESSAGES_ACTUELS <= NBR_MESSAGES) {
				this.messages[NBR_MESSAGES_ACTUELS++] = new MessageUtilisateur(pUtilisateur, pMessage);
				System.out.println(NBR_MESSAGES_ACTUELS);
				return true;
			}			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Limite des messages dépassée : " + NBR_MESSAGES_ACTUELS);
			return false;
		}
		return false;
	}
	public String getListeMessagesAuteur() {
		if (ajouterUtilisateurMessages(null, null) == true) {			
				System.out.println(++NBR_MESSAGES_ACTUELS);
				return "titre : " 
				+ messages[++NBR_MESSAGES_ACTUELS] 
				+ " texte : " + messages[++NBR_MESSAGES_ACTUELS] 
				+ " auteur : " + messages[++NBR_MESSAGES_ACTUELS];
		}
			return "test";
	}
}
