package com.terence.application;

import com.terence.types.CategorieUtilisateur;
import com.terence.types.Forum;
import com.terence.types.Message;
import com.terence.types.MessageUtilisateur;
import com.terence.types.Utilisateur;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Utilisateur jean = new Utilisateur("Jean", "Dupond", CategorieUtilisateur.STANDARD);
		Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
		Utilisateur nathalie = new Utilisateur("Nathalie", "Morin", CategorieUtilisateur.MODERATEUR);
		
//		afficher(jean);
//		afficher(bernard);
//		afficher(nathalie);
		
		Message message1 = new Message("Java SE", "L'encapsulation est une propriété fondamentale", jean);
		Message message2 = new Message("Java SE", "L'héritage en est une autre", jean);
//		MessageUtilisateur messageUtilisateur = new MessageUtilisateur(jean, message1);
//		JOptionPane.showMessageDialog(null, message1);
//		System.out.println(message1);
//		MessageUtilisateur messageUtil = new MessageUtilisateur(jean, message1);
//		JOptionPane.showMessageDialog(null, messageUtil);
//		new Forum(0, messageUtil);
//		JOptionPane.showMessageDialog(null, message2);
//		JOptionPane.showMessageDialog(null, messageUtilisateur.getMessage());
//		JOptionPane.showMessageDialog(null, messageUtilisateur);
		System.out.println(new Forum().ajouterUtilisateurMessages(jean, message1));
		System.out.println(new Forum().getListeMessagesAuteur());
	}

}
