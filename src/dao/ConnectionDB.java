package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private String url="jdbc:mysql://localhost:3306/bibliotheque";
	private String user ="root";
	private String pass="";
	private static ConnectionDB instance;
	
	public Connection getConnection() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			return con;
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		}
		
		private ConnectionDB() 
		{
			
		
		
	}
		public static ConnectionDB getInstance() 
		{
			if(instance == null) instance= new ConnectionDB();
			return instance;
		}
	

}
