package jdbcv3;

public class DBinfo {
	static int count = 0;
	public final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String HOSTNAME = "localhost";	// Host Name
	final static String DBNAME = "sql12624803";	// Database name
	
	final static int PORT = 3306;	// port
	public final static String DBUSER = "root";	// Database username
	public final static String DBPASS = "Neupane@11";	// password
	public final static String URL = "jdbc:mysql://"+HOSTNAME+":" + PORT + "/" + DBNAME;
	

}
