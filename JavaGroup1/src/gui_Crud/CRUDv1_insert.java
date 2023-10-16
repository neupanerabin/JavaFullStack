package gui_Crud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jdbcv3.CRUDV1;

public class CRUDv1_insert extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress; // Label
	JTextField txtPID, txtName, txtAddress; // Create Field
	JButton btnSave, btnClose;

	public CRUDv1_insert() {
		setTitle("CRUD-1");
		setSize(350, 350);
		setResizable(false);
		
		// Create JLabel with PID field
		lblPID = new JLabel("PID "); 		// Label
		lblPID.setBounds(20, 20, 70, 30); 	// JLabel position
		
		// Create a JTextField for entering the ID
		txtPID = new JTextField("Enter id");	 // text field
		txtPID.setBounds(50, 20, 100, 30); 		// text frame

		lblName = new JLabel("Name: "); 		// Label name
		lblName.setBounds(20, 60, 70, 30); 		// Label position
		txtName = new JTextField("Enter name"); 	// text field
		txtName.setBounds(80, 60, 130, 30); 		// text frame

		lblAddress = new JLabel("Address: "); 	// Label Address
		lblAddress.setBounds(20, 100, 70, 30);	// Label Position
		txtAddress = new JTextField("Enter address");	// text field
		txtAddress.setBounds(90, 100, 170, 30);			// text field frame

		btnSave = new JButton("Save"); 		// Button create
		btnSave.setBounds(20, 140, 70, 30); // button place
		btnSave.addActionListener(this);

		btnClose = new JButton("Close"); 		// Close button create
		btnClose.setBounds(90, 140, 70, 30); 	// close button place
		btnClose.addActionListener(this);

		setLayout(null);
		add(lblPID); 	 // call for pid
		add(lblName);  	 // call for name
		add(lblAddress); // call for address

		add(txtPID); 	// text id area
		add(txtName);   // text name area call
		add(txtAddress); 	// txt name address call
		add(btnSave); 	// save button call
		add(btnClose); 	// close button close
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// terminate the program

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		}
		// save Record
		int pid = Integer.parseInt(txtPID.getText());	// get id
		String name = txtName.getText();		// Get name
		String address = txtAddress.getText();	// Get address
		boolean result = new CRUDV1().insert(pid, name, address);	// boolean value for 
		if (result) {
			JOptionPane.showMessageDialog(this, "Save record suucessfully");
		} else {
			JOptionPane.showMessageDialog(this, "Error to  save record ");

		}
	}

	public static void main(String[] args) {
		new CRUDv1_insert();

	}

}
