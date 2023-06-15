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

public class CRUDOperationV3 {
	
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
			
			String sql = "update tbl_person set name = '"+name+"', address='"+address+"' where pid ="+pid;
			stmt.executeUpdate(sql);
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

			conn.close();
			BasicIo.printMessage("Search Record Sucessfully \n");
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
			conn.close();
			BasicIo.printMessage("Sucessfully Deleted \n");
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
		BasicIo.printMessage("Insert the following code for insert : \n");
		int id;
		String names, addresss;
		
		// insert Record
		BasicIo.printMessage("Enter the person id: ");
		pid = BasicIo.readInt();
		BasicIo.printMessage("\n Enter the Name: ");
		names = BasicIo.readString();
		BasicIo.printMessage(" \n Enter the Address: ");
		addresss = BasicIo.readString();
		insert(pid, names, addresss);
		
		// Update records
		BasicIo.printMessage("/n Update Records \n");
		BasicIo.printMessage("Enter the person id to update: ");
		pid = BasicIo.readInt();
		BasicIo.printMessage("\n Enter the updated Name: ");
		names = BasicIo.readString();
		BasicIo.printMessage("\n Enter the updated Address: ");
		addresss = BasicIo.readString();
		update(pid, names, addresss);
		
		// searchRecord
		BasicIo.printMessage("\nEnter pid to search\n");
		BasicIo.printMessage("Enter the person id to Search: ");
		pid = BasicIo.readInt();
		searchRecord(pid);
		
		// Delete Records 
		BasicIo.printMessage("\n Enter pid to Delete\n");
		BasicIo.printMessage("Enter the person id to Delete: ");
		pid = BasicIo.readInt();
		delete(pid);
		
		// DisplayAll
		BasicIo.printMessage("\n Disply all records	\n");
		displayAll();
		
		
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
		*/
	}
}
