package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class MySqlConnection {
	/*
	 * Connection conn; public Connection connect() { try {
	 * Class.forName(DBinfo.DRIVER); conn = DriverManager.getConnection(DBinfo.URL,
	 * DBinfo.DBUSER, DBinfo.DBPASS); } catch(Exception ex) {
	 * System.out.println("Error" + ex.getMessage()); } return conn; } public void
	 * close(Connection conn) { try { conn.close(); }catch(Exception ex) {
	 * System.out.println("Error :"+ ex.getMessage()); }
	 * 
	 * }
	 * 
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBinfo.DRIVER);
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.DBUSER, DBinfo.DBPASS);	// request to connect with database 
		} catch (Exception ex) {
			System.out.println("Error" + ex.getMessage());	// Display exception error 
		}
		return conn;
	}

	public void close(Connection conn) {	// close connection
		try {
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());	// Display error messages 
		}

		// return null;
	}

}
