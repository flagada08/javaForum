package com.terence.types;

public class Forum {
	private final int NBR_MESSAGES = 10;
	private int NBR_MESSAGES_ACTUELS;
	private MessageUtilisateur[] messages;
	/**
	 * @param p_NBR_MESSAGES_ACTUELS
	 * @param pMessages
	 */
	public Forum(/**int p_NBR_MESSAGES_ACTUELS, MessageUtilisateur[] pMessages*/) {
//		super();
//		NBR_MESSAGES_ACTUELS = p_NBR_MESSAGES_ACTUELS;
//		messages = pMessages;
		messages = new MessageUtilisateur[NBR_MESSAGES];
//		System.out.println(messages);
	}
	public boolean ajouterUtilisateurMessages(Utilisateur pUtilisateur , Message pMessage) {
		if (messages != null) {
			messages[NBR_MESSAGES_ACTUELS] = new MessageUtilisateur(pUtilisateur, pMessage);
			return messages[NBR_MESSAGES_ACTUELS] != null;
		}
		return false;
	}
	public String getListeMessagesAuteur() {
//		System.out.println(messages.toString());
		for (int i = NBR_MESSAGES_ACTUELS; i < NBR_MESSAGES; i++) {
			System.out.println(NBR_MESSAGES_ACTUELS);
			return "Titre : " + messages[i];
			}
		return null;
	}
}
