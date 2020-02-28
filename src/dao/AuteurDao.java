package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Auteur;
import beans.Livre;

public class AuteurDao implements IAuteurDao{

	private Connection con= ConnectionDB.getInstance().getConnection();
	@Override
	public int saveAuteur(Auteur au) {
		try {
			if (con!=null) {
			PreparedStatement pre = con.prepareStatement("Insert into auteur(nom,prenom) values (?,?)");
			pre.setString(1, au.getNom());
			pre.setString(2,au.getPrenom());
			return pre.executeUpdate();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public ArrayList<Auteur> getAuteurs() {
		
		ArrayList<Auteur> liste = new ArrayList<Auteur>();
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from livre");
			while(rs.next()) 
			{
				liste.add(new Auteur(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			
			return liste;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
