package jdbcv3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import global.Global;
import myLibrary.BasicIo;

public class CRUDV1 extends MySqlConnection{
	
	public boolean insert(int pid, String name, String address) {
		boolean result=false;
		String sql = "INSERT INTO tbl_person VALUES(?, ?, ?)";		// ?--> field
		try {
			Connection conn = connect();	// Connect with database
			// Insert Record 
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);	// set PID
			pstat.setString(2, name);	// set name
			pstat.setString(3, address);	// set Address
			pstat.executeUpdate();	// RUN the SQL Statement
			pstat.close();	// Statement close
			closeConnection();	// Close connection
			result = true;
		}
		catch(Exception ex){
			BasicIo.printMessage("Error: S"+ex.getMessage());
		}
		return result;
	}

	// Search Data
	
	public boolean search(int pid) {
		boolean result=false;
		String sql = "SELECT * FROM tbl_person WHERE pid=?";
		Global.pid=1;
		try {
			Connection conn = connect();	// Connect with database
	        PreparedStatement pstat = conn.prepareStatement(sql);	// execute parameterized query
	        pstat.setInt(1, pid); // Set PID
	        // error on here
	        ResultSet rs = pstat.executeQuery(); // Execute the query
	        while(rs.next()) {
		    	  result =true;
		    	  Global.pid = rs.getInt("pid");
		    	  Global.name = rs.getString("name");
		    	  Global.address = rs.getString("address");
		      }
	        pstat.close();
	        rs.close();
	        closeConnection();
			
		}
		catch(Exception ex) {
			Global.pid=-1;
			BasicIo.printMessage("Error: "+ex);
		}
		
		return result;
	}
	
	// Didplay all data
	public void selectAll() {
		
	}
	
	// Update data 
	public boolean update(int pid, String name, String address) {
		boolean result = false;
		
		return result;
	}
	
	// Delete data
	public boolean delete(int pid) {
		boolean result = false;
		return result;
	}


}
