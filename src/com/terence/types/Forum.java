package com.terence.types;

import javax.swing.JOptionPane;
/**
 * 
 * @author B450
 *
 */
public class Forum {
	private final int NBR_MESSAGES = 10;
	private int NBR_MESSAGES_ACTUELS;
	private MessageUtilisateur[] messages;
	/**
	 * 
	 */
	public Forum(/**int p_NBR_MESSAGES_ACTUELS, MessageUtilisateur[] pMessages*/) {
		//		super();
		//		NBR_MESSAGES_ACTUELS = p_NBR_MESSAGES_ACTUELS;
		//		messages = pMessages;
		this.messages = new MessageUtilisateur[NBR_MESSAGES];
	}
	public int getNBR_MESSAGES_ACTUELS() {
		return NBR_MESSAGES_ACTUELS;
	}
	//	public void setNBR_MESSAGES_ACTUELS(int nBR_MESSAGES_ACTUELS) {
	//		NBR_MESSAGES_ACTUELS = nBR_MESSAGES_ACTUELS;
	//	}
	public MessageUtilisateur[] getMessages() {
		return messages;
	}
	//	public void setMessages(MessageUtilisateur[] messages) {
	//		this.messages = messages;
	//	}
	public boolean ajouterUtilisateurMessages(Utilisateur pUtilisateur , Message pMessage) {
//		try {
			if(NBR_MESSAGES_ACTUELS < NBR_MESSAGES) {
				this.messages[NBR_MESSAGES_ACTUELS++] = new MessageUtilisateur(pUtilisateur, pMessage);
				return true;
			}
//		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Limite de " + NBR_MESSAGES_ACTUELS + " messages dépassée", "ALERTE", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
			return false;
//		}
//		return false;
	}
	public String getListeMessagesAuteur(String pMessages) {
//		if(messages[NBR_MESSAGES_ACTUELS] != null) {
		for(int m = 0; m < this.NBR_MESSAGES_ACTUELS; m++) {
			System.out.println("titre : " + messages[m].getMessage().getTitre() + " -- " + "texte : " + messages[m].getMessage().getTexte());
			pMessages = pMessages + "TITRE : " 
					+ messages[m].getMessage().getTitre() 
					+ " -- " 
					+ " TEXTE : " 
					+ messages[m].getMessage().getTexte() 
					+ " -- " 
					+ " AUTEUR : " 
					+ messages[m].getUtilisateur().getPrenom()
					+ " "
					+ messages[m].getUtilisateur().getNom().toUpperCase()
					+ "\n";	
		}
//		}
		return pMessages;
	}
}
