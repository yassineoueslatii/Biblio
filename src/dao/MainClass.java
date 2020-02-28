package dao;

import beans.Auteur;
import beans.Livre;

public class MainClass {

	public static void main(String[] args) {
	Auteur a = new Auteur("sdsd", "dffd", 2);
	AuteurDao daoA= new AuteurDao();
	System.out.println(daoA.saveAuteur(a));
	Livre lv = new Livre("fdff", "fdf", 4);
	LivreDao daoL= new LivreDao();
	System.out.println(daoL.saveLivre(lv));
	
	

	}

}
