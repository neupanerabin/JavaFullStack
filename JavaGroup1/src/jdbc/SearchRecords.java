package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchRecords {
	public static void main(String[] args) {
		//connection
		final String DRIVER = "com.mysql.cj.jdbc.Driver";	// Driver link provided
		
		// Database connection
		final String DBNAME = "sql12624803";				// Database name 
		final String HOST = "sql12.freemysqlhosting.net";	// Host name
		final String DBUSER = "sql12624803";	// Database user
		final String DBPASS="6p9k3h3bWq";		//Database password
		final int PORT = 3306;
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME; // merge all and create url
		int count = 0;
		try {
			// connection
			Class.forName(DRIVER);	// Loading Driver
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);		// request for connection
			
			// Insert Records
			Statement state = conn.createStatement();	

			String sql="SELECT * FROM tbl_person where pid=11";
			ResultSet rs = state.executeQuery(sql);	// Get all records from table
			
			System.out.println("PID\t\t Name\t\t\tAddress");	// Display output
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+"\t \t"+ rs.getString("name")+"\t\t"+ rs.getString("address"));
				count++;
			}
			rs.close();
			state.close();
			conn.close();
			
			System.out.print("Search records successfully");
			System.out.print("\nTotal Records: "+count);
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
		
	

}
