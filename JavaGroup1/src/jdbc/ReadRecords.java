package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {
	public static void main(String[] args) {
		// Connection details
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
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
