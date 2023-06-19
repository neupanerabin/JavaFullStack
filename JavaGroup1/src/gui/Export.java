package gui;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import jdbcv3.CRUDV1;

public class Export extends JFrame implements ActionListener{
	
	
	 public Export() {
	        // Create the table and model

			boolean result = new CRUDV1().Export(); // call CRUDV1 file

	    }
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		}
		
	
	
	public static void main(String[] args) {
		Export frame = new Export();
       
		
	}

}

