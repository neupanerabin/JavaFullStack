package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static String url = "jdbc:mysql://localhost:3306/Mhiits";

	private static String username = "root";
	private static String password = "Neupane@11";

	public static Connection getDatabaseConnection() throws SQLException {

		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;

	}

}
