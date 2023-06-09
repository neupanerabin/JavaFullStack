package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertRecords {
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
			// Insert Records
			String sql="INSERT INTO tbl_person VALUES(11, 'Rabin Neupane', 'ktm')";
			Statement state = conn.createStatement();
			state.executeUpdate(sql);
			
			JOptionPane.showMessageDialog(null, "Inserted Successfully");
			conn.close();
			System.out.println("Connect with database successfully");
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}

}
