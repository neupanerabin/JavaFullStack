package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jdbcv3.CRUDV1;


public class CRUD1 extends JFrame implements ActionListener{
	JLabel lblPID, lblName, lblAddress;		// Label
	JTextField txtPID, txtName, txtAddress;	// Create Field
	JButton btnSave, btnClose;
	
	public CRUD1() {
		setTitle("CRUD-1");
		setSize(350, 350);
		setResizable(false);
		
		lblPID = new JLabel("PID ");
		lblPID.setBounds(20, 20, 70, 30);		// JLabel area
		txtPID = new JTextField("Enter id");	// 
		txtPID.setBounds(50, 20, 100, 30);		// text field coordinates
		
		lblName = new JLabel("Name: ");
		lblName.setBounds(20, 60, 70, 30);
		txtName = new JTextField("Enter name");
		txtName.setBounds(80,60, 130, 30);

		lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(20, 100, 70, 30);
		txtAddress = new JTextField("Enter address");
		txtAddress.setBounds(90,100, 170, 30);

		
		btnSave = new JButton("Save");	// Button create
		btnSave.setBounds(20, 140, 70, 30);	// button place 
		btnSave.addActionListener(this);
		
		btnClose = new JButton("Close");	// Close button create
		btnClose.setBounds(90, 140, 70, 30);	// close button place
		btnClose.addActionListener(this);
		
		setLayout(null);
		add(lblPID);	// call for pid
		add(lblName);	// call for name
		add(lblAddress);	// call for address
		
		add(txtPID);	// text id area
		add(txtName);	// text name area call
		add(txtAddress);	//txt name address call
		add(btnSave);	// save button call
		add(btnClose);	// close button close
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		new CRUD1();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);
		}
		else if(ae.getSource()==btnSave) {
			// save Record
			int pid = Integer.parseInt(txtPID.getText());
			String name = txtName.getText();
			String address = txtAddress.getText();
			boolean result = new CRUDV1().insert(pid, name, address);
			if(result) {
				JOptionPane.showMessageDialog(btnClose, ae);
			}
			else {
				JOptionPane.showMessageDialog(this, "Error to  save record ");

			}
			}
	}




}
