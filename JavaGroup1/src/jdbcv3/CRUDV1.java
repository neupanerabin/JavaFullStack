package jdbcv3;


import java.sql.Connection;
import java.sql.PreparedStatement;

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

	
	
	public boolean search(int pid) {
		boolean result = false;
		
		return result;
	}
	
	public void selectAll() {
		
	}
	
	public boolean update(int pid, String name, String address) {
		boolean result = false;
		
		return result;
	}
	
	public boolean delete(int pid) {
		boolean result = false;
		return result;
	}


}
