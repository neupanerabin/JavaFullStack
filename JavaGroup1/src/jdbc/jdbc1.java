package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc1 {
	public static void main(String[] args) {
		//connection
		final String DRIVER = "com.mysql.cj.jdbc.Driver";	// Driver link provided
		
		// 
		final String DBNAME = "sql12624803";	
		final String HOST = "sql12.freemysqlhosting.net";
		final String DBUSER = "sql12624803";
		final String DBPASS="6p9k3h3bWq";
		final int PORT = 3306;
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME; 
		try {
			// connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			conn.close();
			System.out.println("Connect with database successfully");
		}
		catch(SQLException ex){
			System.out.println(ex);
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}

}
