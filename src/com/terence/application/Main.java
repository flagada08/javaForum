package com.terence.application;

import com.terence.types.CategorieUtilisateur;
import com.terence.types.Forum;
import com.terence.types.Message;
import com.terence.types.Utilisateur;
import static com.terence.types.Utilisateur.afficher;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Utilisateur jean = new Utilisateur("Jean", "Dupond", CategorieUtilisateur.STANDARD);
		Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
		Utilisateur nathalie = new Utilisateur("Nathalie", "Morin", CategorieUtilisateur.MODERATEUR);
		Utilisateur terence = new Utilisateur("Terence", "Persin", CategorieUtilisateur.MODERATEUR);
		
//		afficher(jean);
//		afficher(bernard);
//		afficher(nathalie);
		
		Forum forum1 = new Forum();
		Forum forum2 = new Forum();
		
		Message message1 = new Message("Java SE", "L'encapsulation est une propriété fondamentale", jean);
		Message message2 = new Message("Java SE", "L'héritage en est une autre", jean);
		Message message3 = new Message("Java SE", "Le polymorphisme est implicite en Java", jean);
		Message message4 = new Message("Java EE", "Les annotations sont pratiques en Java", jean);
		Message message5 = new Message("Java EE", "Applications n-tiers", bernard);
		Message message6 = new Message("Java EE", "Couche Web: Servlet et JSP", bernard);
		Message message7 = new Message("Java EE", "JSF: Framework - Couche Présentation", nathalie);
		Message message8 = new Message("Java EE", "JPA - Hibernate", nathalie);
		Message message9 = new Message("Java EE", "JDBC", nathalie);
		Message message10 = new Message("Java EE", "La POO c'est surfait", terence);
//		Message message11 = new Message("LIMITE TEST", "Test de limite des messages", bernard);
		
//		try {
		JOptionPane.showMessageDialog(null, Message.nForum.getListeMessagesAuteur("FORUM\n======\n"), "Liste des Messages par Auteur", JOptionPane.INFORMATION_MESSAGE);
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Limite des messages dépassée");
//			System.exit(1);
//		}
	}

}
