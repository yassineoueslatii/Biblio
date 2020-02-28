package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Livre;

public class LivreDao  implements ILivreDao{
	
	private Connection con= ConnectionDB.getInstance().getConnection();

	@Override
	public int saveLivre(Livre li) {
		try {
			if (con!=null) {
			PreparedStatement pre = con.prepareStatement("Insert into livre (isbn,categorie,titre) values (?,?,?)");
			pre.setInt(1, li.getIsbn());
			pre.setString(2,li.getCategorie());
			pre.setString(3,li.getTitre());
			return pre.executeUpdate();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public ArrayList<Livre> getLivres() {
		
		ArrayList<Livre> liste = new ArrayList<Livre>();
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from livre");
			while(rs.next()) 
			{
				liste.add(new Livre(rs.getString(3), rs.getString(2), rs.getInt(1)));
			}
			
			return liste;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
		
	}
	public int suprimLivre(int id) {
		try {
			if (con!=null) {
			PreparedStatement pre = con.prepareStatement("delete from livre where isbn=?");
			pre.setInt(1, id);
			return pre.executeUpdate();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
