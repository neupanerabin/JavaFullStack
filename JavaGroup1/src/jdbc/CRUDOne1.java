package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOne1 {
	
	// insert file
	public static void insert() {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";	// Driver link provided
		
		// Database connection
		final String DBNAME = "sql12624803";				// Database name 
		final String HOST = "sql12.freemysqlhosting.net";	// Host name
		final String DBUSER = "sql12624803";	// Database user
		final String DBPASS="6p9k3h3bWq";		//Database password
		final int PORT = 3306;
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME; // merge all and create url
		
		try {
			// connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);		// request for connection
			// Insert Records
			String sql="INSERT INTO tbl_person VALUES(11, 'Ronaldo Nazirio', 'bzr')";
			Statement state = conn.createStatement();	
			state.executeUpdate(sql);
			conn.close();	// Connection close
			System.out.println("Data insert to database successfully\n");
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}
	
	
	public static void select() {
		final String DRIVER = "com.mysql.cj.jdbc.Driver"; // Driver link provided
		final String DBNAME = "sql12624803"; // Database name
		final String HOST = "sql12.freemysqlhosting.net"; // Database host
		final String DBUSER = "sql12624803"; // database username
		final String DBPASS = "6p9k3h3bWq"; // database password
		final int PORT = 3306;
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME; // create url

		try {
			// Load the driver and establish the connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // Connection established

			// Execute the SELECT query
			String sql = "SELECT * FROM tbl_person"; // select records from database
			Statement statement = conn.createStatement(); // create statement
			ResultSet resultSet = statement.executeQuery(sql); // execute query

			// Process the result set
			while (resultSet.next()) {
				int pid = resultSet.getInt("pid"); // read pid from database
				String name = resultSet.getString("name"); // read name from database
				String address = resultSet.getString("address"); // read address from database
				// Display all records
				System.out.println("ID: " + pid + ",   	Name: " + name + ", 			Address: " + address);
			}

			// Close the resources
			resultSet.close();
			statement.close();
			conn.close();	// terminate the connection
			System.out.println("\n");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
	}
	
	public static void search() {
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

			String sql="SELECT * FROM tbl_person where pid=110";
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
			System.out.println("\n");
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	
		
		}
	public static void update() {
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

					String sql="UPDATE tbl_person SET name='New Name', address='New Address' WHERE pid=11";
					 state.executeUpdate(sql);	// Get all records from table
					state.close();
					conn.close();
					
					System.out.print("Update records successfully \n");
					
				}
				
				catch(Exception ex) {
					System.out.println("Error : "+ex.getMessage());
				}
			}
				
	
	
public static void delete() {
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

		String sql="DELETE FROM tbl_person WHERE pid=11";
		 state.executeUpdate(sql);	// Get all records from table
		state.close();
		conn.close();
		
		System.out.print("Delete records successfully \n");
		
	}
	
	catch(Exception ex) {
		System.out.println("Error : "+ex.getMessage());
	}

	
	}
	public static void main(String []args) {
		insert();
		select();
		search();
		update();
		delete();
	}

}
