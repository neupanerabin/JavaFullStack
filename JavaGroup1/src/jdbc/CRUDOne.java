package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import myLibrary.BasicIo;

import javax.swing.JOptionPane;

public class CRUDOne {
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
		
		try {
			// connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);		// request for connection
			
			BasicIo.printMessage("Enter Your Choice:");
			BasicIo.printMessage("\n"
					+ "1. Insert Data\n"
					+ "2. Select All Data \n"
					+ "3. Search Data \n"
					+ "4. Update Data \n"
					+ "5. Delete Data \n");
			int choices = BasicIo.readInt();
			Statement state = conn.createStatement(); // create statement

			switch(choices) {	// select data 
			case 1:
				BasicIo.printMessage("Insert New Data: ");
				String sql="INSERT INTO tbl_person VALUES(11, 'Rabin Neupane', 'ktm')";
				state.executeUpdate(sql);
				BasicIo.printMessage("Data insert Successfully");
				break;
				
			case 2:
				BasicIo.printMessage("");
				String readsql = "SELECT * FROM tbl_person"; // select records from database
				//Statement statement = conn.createStatement(); // create statement
				ResultSet resultSet = state.executeQuery(readsql); // execute query

				// Process the result set
				while (resultSet.next()) {
					int pid = resultSet.getInt("pid"); // read pid from database
					String name = resultSet.getString("name"); // read name from database
					String address = resultSet.getString("address"); // read address from database
					// Display all records
					System.out.println("ID: " + pid + ",   	Name: " + name + ", 			Address: " + address);
				}
				BasicIo.printMessage("Data Display Successfully");
				break;
				
				
			case 3:
				String searchsql="SELECT * FROM tbl_person where pid=11";
				ResultSet rs = state.executeQuery(searchsql);	// Get all records from table
				
				System.out.println("PID\t\t Name\t\t\tAddress");	// Display output
				while(rs.next()) {
					System.out.println(rs.getInt("pid")+"\t \t"+ rs.getString("name")+"\t\t"+ rs.getString("address"));
				}
				BasicIo.printMessage("Data search Successfully");
				break;
				
			case 4:
				String updatesql="UPDATE tbl_person SET name='New Name', address='New Address' WHERE pid=11";
				 state.executeUpdate(updatesql);	// Get all records from table
				 BasicIo.printMessage("Data update Successfully");
				 break;
				 
			case 5:
				String deletesql="DELETE FROM tbl_person WHERE pid=110";
				 state.executeUpdate(deletesql);	// Get all records from table
				 BasicIo.printMessage("Data deleted succcessfully");
				break;
			}
			
			state.close();
			conn.close();	// Connection close
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}

}
