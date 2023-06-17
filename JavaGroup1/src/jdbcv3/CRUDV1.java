package jdbcv3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import global.Global;
import myLibrary.BasicIo;

public class CRUDV1 extends MySqlConnection {

	public boolean insert(int pid, String name, String address) {
		boolean result = false;
		String sql = "INSERT INTO tbl_person VALUES(?, ?, ?)"; // ?--> field
		try {
			Connection conn = connect(); // Connect with database
			// Insert Record
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid); // set PID
			pstat.setString(2, name); // set name
			pstat.setString(3, address); // set Address
			pstat.executeUpdate(); // RUN the SQL Statement
			pstat.close(); // Statement close
			closeConnection(); // Close connection
			result = true;
		} catch (Exception ex) {
			BasicIo.printMessage("Error: S" + ex.getMessage());
		}
		return result;
	}

	// Search Data

	public boolean search(int pid) {
		boolean result = false;
		String sql = "SELECT * FROM tbl_person WHERE pid=?";
		Global.pid = 1;
		try {
			Connection conn = connect(); // Connect with database
			PreparedStatement pstat = conn.prepareStatement(sql); // execute parameterized query
			pstat.setInt(1, pid); // Set PI
			ResultSet rs = pstat.executeQuery(); // Execute the query
			while (rs.next()) {
				result = true;
				Global.pid = rs.getInt("pid");
				Global.name = rs.getString("name");
				Global.address = rs.getString("address");
			}
			// Close all connection
			pstat.close();
			rs.close();
			closeConnection();

		} catch (Exception ex) { // exception
			Global.pid = -1;
			BasicIo.printMessage("Error: " + ex);
		}

		return result;
	}

	// Update data
	public boolean update(int pid, String name, String address) {
		boolean result = false;
		// String newAddress = "", newName = "";
		String sql = "UPDATE tbl_person SET name=?, address=? WHERE pid =?";
		Global.pid = 1;
		try {
			Connection conn = connect(); // connect with database
			PreparedStatement pstat = conn.prepareStatement(sql);

			pstat.setString(1, name); // Set new name
			pstat.setString(2, address); // set new address
			pstat.setInt(3, pid); // set PID

			int rowAffected = pstat.executeUpdate(); // update all new data
			if (rowAffected > 0) {
				result = true;
				Global.pid = pid;
				Global.name = name;
				Global.address = address;
			}
			pstat.close(); // close connection
			closeConnection(); // close connection
		} catch (Exception ex) {
			Global.pid = -1;
			BasicIo.printMessage("Error" + ex);
		}

		return result;
	}

	// Delete data
	public boolean delete(int pid) {
		boolean result = false;
		String sql = "DELETE FROM tbl_person WHERE pid =?";
		Global.pid = 1;
		try {
			Connection conn = connect();	// connection start with database
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);

			int rs = pstat.executeUpdate(); // run sql statement

			// close connection
			pstat.close();
			// rs.close();
			conn.close();
		} catch (Exception ex) {
			Global.pid = -1;
			BasicIo.printMessage("Error: " + ex);
		}
		return result;
	}
	
	// Didplay all data
	public boolean selectAll() {

		try {
		    Connection conn = connect();  // Connect with the database
		    Statement stmt = conn.createStatement();
		    String sql = "SELECT * FROM tbl_person";
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    DefaultTableModel model = new DefaultTableModel(); // Instantiate the model here

	        String[] columnNames = {"ID", "Name", "Address"};
	        model.setColumnIdentifiers(columnNames);

		    while (rs.next()) {
		        int pid = rs.getInt("pid");
		        String name = rs.getString("name");
		        String address = rs.getString("address");
		        model.addRow(new Object[]{pid, name, address});
		    }
		    
		  //closeConnection();
		    rs.close();
		    stmt.close();
		    
		   // table.setModel(model);
		    
		} catch (Exception ex) {
		    BasicIo.printMessage("Error: " + ex);
		}
		
		return false;



	}
	

}
