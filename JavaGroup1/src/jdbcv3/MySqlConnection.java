package jdbcv3;

import java.sql.Connection;
import java.sql.DriverManager;

import myLibrary.BasicIo;

public class MySqlConnection {
	Connection conn = null;

	public Connection connect() {
		try {
			Class.forName(DBinfo.DRIVER); // Load Driver
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.DBUSER, DBinfo.DBPASS); // url, username, password
		} 
		catch (Exception ex) {
			BasicIo.printMessage("Errors: " + ex.getMessage());
		}
		return conn;
	}

	public void closeConnection() {
		try {
			conn.close();

		} catch (Exception ex) {
			BasicIo.printMessage("Error" + ex.getMessage());
		}
	}

}
