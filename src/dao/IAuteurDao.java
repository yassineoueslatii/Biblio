package dao;

import java.util.ArrayList;

import beans.Auteur;

public interface IAuteurDao {
	
	public int saveAuteur(Auteur au);
	public ArrayList<Auteur> getAuteurs();

}
