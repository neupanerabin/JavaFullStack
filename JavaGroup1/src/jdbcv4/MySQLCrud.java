package jdbcv4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import global.Global;
import myLibrary.BasicIo;

public class MySQLCrud extends MySQLConnection implements CRUD{
	//connect():Connection
	// 
	
	public boolean insert(Person person) {
		boolean result = false;
		String sql = "INSERT INTO Student VALUES(?, ?, ?)";
		try {
			Connection conn = connect();
			PreparedStatement psta = conn.prepareStatement(sql);
			psta.setInt(1, person.getPid());
			psta.setString(2, person.getName());
			psta.setString(3, person.getAddress());
			psta.executeUpdate();
			psta.close();
			close(conn);
			
		}catch(Exception ex) {
			BasicIo.printMessage(""+ex);
		}
		return result;
	}
	
//	@Override
	public Person search(int pid) {
		String sql = "SELECT * FROM Student WHERE pid=?";
		Person person = null;
		try {
			Connection conn = connect();
			PreparedStatement psta = conn.prepareStatement(sql);
			psta.setInt(1, pid);
			ResultSet rs = psta.executeQuery();
			while(rs.next()){
					person = new Person();
					person.setPid(rs.getInt("pid"));
					person.setName(rs.getString("name"));
					person.setAddress(rs.getString("address"));
			}
			psta.close();
			close(conn);
			
		}catch(Exception ex) {
			BasicIo.printMessage(""+ex);
		}
		return person;
	}
	
//	@Override
	public boolean update(Person person) {
		
		boolean result = false;
		String sql = "UPDATE Student  SET name=?, address= ? WHERE pis=?";
		try {
			Connection conn = connect();
			PreparedStatement psta = conn.prepareStatement(sql);
			psta.setString(1, person.getName());
			psta.setString(2, person.getAddress());
			psta.setInt(1, person.getPid());
			psta.executeQuery();
			psta.close();
			close(conn);
			
		}catch(Exception ex) {
			BasicIo.printMessage(""+ex);
		}
		
		return false;
	}
	

//	@Override
	public boolean delete(int pid) {
		boolean result = false;
		String sql = "DELETE * FROM Student WHERE pid =?";
		Global.pid = 1;
		try {
			Connection conn = connect();	// connection start with database
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			pstat.executeQuery();
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
//	@Override
	public Vector persons() {
		Vector allPersons=new Vector();
		String sql = "SELECT * FROM Student";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				Person person=new Person();
				person.setPid(rs.getInt("pid"));
				person.setName(rs.getString("name"));
				person.setAddress(rs.getString("address"));
				allPersons.add(person);
			}
			pstat.close();
			close(conn);
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return allPersons;
	}
	

}
