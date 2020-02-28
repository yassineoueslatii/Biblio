package dao;

import java.util.ArrayList;

import beans.Livre;

public interface ILivreDao {
	
	public int saveLivre(Livre li);
	public ArrayList<Livre> getLivres();
	public int suprimLivre(int id);

}
