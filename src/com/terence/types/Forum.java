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
		try {
			if(NBR_MESSAGES_ACTUELS < NBR_MESSAGES) {
				this.messages[NBR_MESSAGES_ACTUELS++] = new MessageUtilisateur(pUtilisateur, pMessage);
				System.out.println(messages[NBR_MESSAGES_ACTUELS++]);
				return true;
			}			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Limite des messages dépassée : " + NBR_MESSAGES_ACTUELS);
			System.exit(1);
			return false;
		}
		return false;
	}
	public String getListeMessagesAuteur() {
		System.out.println(NBR_MESSAGES_ACTUELS);
			return "titre : " 
				+ messages[NBR_MESSAGES_ACTUELS].getMessage().getTitre() 
				+ " texte : " 
				+ messages[NBR_MESSAGES_ACTUELS].getMessage().getTexte() 
				+ " auteur : " 
				+ messages[NBR_MESSAGES_ACTUELS].getUtilisateur().getPrenom();
	}
}
