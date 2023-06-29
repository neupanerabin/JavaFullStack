package jdbcv4;

import java.sql.Connection;
import java.sql.DriverManager;

import myLibrary.BasicIo;

public class MySQLConnection {
	Connection conn;
	public Connection connect() {
			try {
				Class.forName(DBinfo.DRIVER);
				conn = DriverManager.getConnection(DBinfo.URL, DBinfo.DBUSER, DBinfo.DBPASS);
			}
			catch(Exception ex) {
				BasicIo.printMessage("Error" + ex.getMessage());
			}
			return conn;
		}
	public void close(Connection conn) {
		try {
			conn.close();
		}catch(Exception ex) {
			BasicIo.printMessage("Error :"+ ex.getMessage());
		}
		
	}

}
