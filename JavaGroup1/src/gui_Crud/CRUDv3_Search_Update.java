package gui_Crud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import global.Global;
import jdbcv3.CRUDV1;

public class CRUDv3_Search_Update extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress; // Label
	JTextField txtPID, txtName, txtAddress; // Create Field
	JButton btnSearch, btnClose, btnUpdate; // Button dec;aration

	public CRUDv3_Search_Update() {
		setTitle("Button Search");
		setSize(350, 350);
		setResizable(false);

		// Create JLabel with PID field
		lblPID = new JLabel("PID "); // Label
		lblPID.setBounds(20, 20, 70, 30); // JLabel position

		// Create a JTextField for entering the ID
		txtPID = new JTextField("Enter id"); // text field
		txtPID.setBounds(50, 20, 100, 30); // text frame

		lblName = new JLabel("Name: "); // Label name
		lblName.setBounds(20, 60, 70, 30); // Label position
		txtName = new JTextField("Enter name"); // text field
		txtName.setBounds(80, 60, 130, 30); // text frame

		lblAddress = new JLabel("Address: "); // Label Address
		lblAddress.setBounds(20, 100, 70, 30); // Label Position
		txtAddress = new JTextField("Enter address"); // text field
		txtAddress.setBounds(90, 100, 170, 30); // text field frame

		// Search
		btnSearch = new JButton("Search"); // Button search create
		btnSearch.setBounds(20, 140, 70, 30); // button position
		btnSearch.addActionListener(this);

		// Close button
		btnClose = new JButton("Close"); // Close button create
		btnClose.setBounds(90, 140, 70, 30); // close button position
		btnClose.addActionListener(this);

		// Update button
		btnUpdate = new JButton("Update"); // BVutton update create
		btnUpdate.setBounds(160, 140, 70, 30); // update button position
		btnUpdate.addActionListener(this); // call action listener

		setLayout(null);
		add(lblPID); // call for pid
		add(lblName); // call for name
		add(lblAddress); // call for address

		add(txtPID); // text id area
		add(txtName); // text name area call
		add(txtAddress); // text name address call
		add(btnSearch); // save button call
		add(btnClose); // close button close

		add(btnUpdate); // button update add

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate the program

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		}
		// save Record
		else if (ae.getSource() == btnSearch) {
			int pid = Integer.parseInt(txtPID.getText()); // get id

			boolean result = new CRUDV1().search(pid); // boolean value for
			if (result) {
				txtName.setText(Global.name);
				txtAddress.setText(Global.address);

				JOptionPane.showMessageDialog(this, "Search record suucessfully");
			} else {
				txtName.setText("");
				txtAddress.setText("");
				JOptionPane.showMessageDialog(this, "Error to  search record ");

			}
		}
		else if(ae.getSource() == btnUpdate){
			int pid = Integer.parseInt(txtPID.getText());	// Get pid 
			String newName = txtName.getText();	// Get new name
			String newAddress = txtAddress.getText();	// get new address
			
			boolean result = new CRUDV1().update(pid, newName, newAddress);
			if(result) {
				JOptionPane.showMessageDialog(this, "Record update suucessfully");
			} else {
				JOptionPane.showMessageDialog(this, "Error to  update record ");

			}
			}
		}
	

	public static void main(String[] args) {
		new CRUDv3_Search_Update();

	}

}
