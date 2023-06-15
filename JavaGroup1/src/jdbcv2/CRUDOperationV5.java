package jdbcv2;

/**
 * Author Kiran
 * Version 1
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import myLibrary.BasicIo;

public class CRUDOperationV5 {
	
	static int count = 0;
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String DBNAME = "sql12624803";
	final static String DBPASS = "6p9k3h3bWq";
	final static int PORT = 3306;
	final static String DBUSER = "sql12624803";
	final static String URL = "jdbc:mysql://sql12.freemysqlhosting.net:" + PORT + "/" + DBNAME;

	public static void insert(int pid, String name, String address) {
		// insert in db
		try {
			// Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			Statement stmt = conn.createStatement();
			
			String sql = "insert into tbl_person values ("+pid+",'"+name+"','"+address+"')";
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Inserted Scuessfully");
			conn.close();
			BasicIo.printMessage("Sucessfully Connected");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void update(int pid, String name, String address) {
		// update in db
		try {
			// Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			Statement stmt = conn.createStatement();
			
			String sql = "update tbl_person set name = '"+name+"', set address='"+address+"' where pid ="+pid;
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Updated Scuessfully");
			conn.close();
			BasicIo.printMessage("Sucessfully Changed");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void searchRecord(int pid) {
		// search in db
		try {
			// Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			Statement stmt = conn.createStatement();
			
			String sql = "select * from tbl_person where pid ="+pid;
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("PID\tNAME\t\tADDRESS");
			while (((ResultSet) rs).next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				
			}

			JOptionPane.showMessageDialog(null, "Search Record Sucessfully");
			conn.close();
			BasicIo.printMessage("Search Record Sucessfully ");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void delete(int pid) {
		// delete from db
		try {
			// Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			Statement stmt = conn.createStatement();
			
			String sql = "delete from tbl_person where pid = "+pid;
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Deleted Scuessfully");
			conn.close();
			BasicIo.printMessage("Sucessfully Deleted");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void displayAll() {
		// display from db
		try {
			// Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			Statement stmt = conn.createStatement();
			
			String sql = "select * from tbl_person";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("PID\tNAME\t\tADDRESS");
			while (((ResultSet) rs).next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				count++;
			}

			JOptionPane.showMessageDialog(null, "Display Scuessfully");
			conn.close();
			BasicIo.printMessage("Total Records = " + count);
			BasicIo.printMessage("Displayed Sucessfully ");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int pid;
		String name, address;
		
		/*
		//Insert Record
		pid=read from user?
		name, address = read from user?
		insert(1,"Raj","KTM");
		
		//Update Record
		pid=read from user?
		name, address = read from user?
		update(1, "Raj Sharma", "Lat");
		
		//Search Record
		pid=read from user?
		searchRecord(1);
		
		//Delete Record
		pid=read from user?
		delete(100);
		displayAll();
		
		//Convert to Menu Based program
		1. Load - Read from CSV file //Restore
		2. Display All
		3. Search
		4. Update
		5. Delete
		6. Export All - Write all to CSV file //Backup
		*/
	}
}
