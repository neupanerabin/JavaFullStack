package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import jdbcv3.CRUDV1;

public class CRUDv5_Display_in_Table extends JFrame implements ActionListener{
	
	private JTable table;
	private DefaultTableModel model;
	
	 public CRUDv5_Display_in_Table() {
	        // Create the table and model
	        table = new JTable();
	        model = new DefaultTableModel();

	        String[] columnNames = {"ID", "Name", "Address"};
	        model.setColumnIdentifiers(columnNames);

	        // Set the model to the table
	        table.setModel(model);

	        // Add the table to a scroll pane
	        JScrollPane scrollPane = new JScrollPane(table);
	        add(scrollPane);

			boolean result = new CRUDV1().selectAll(); // boolean value for

	        if (result) {
	            JOptionPane.showMessageDialog(this, "Records retrieved successfully");
	        } else {
	            JOptionPane.showMessageDialog(this, "Error retrieving records");
	        }
	    }
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 
			boolean result = new CRUDV1().selectAll(); // call CRUDV1 file
			if (result) {
				
				JOptionPane.showMessageDialog(this, "Search record suucessfully");	// Display popup box 
			} else {
				
				JOptionPane.showMessageDialog(this, "Error to  search record ");

			}
		}
		
	
	
	public static void main(String[] args) {
		CRUDv5_Display_in_Table frame = new CRUDv5_Display_in_Table();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		
	}

}
