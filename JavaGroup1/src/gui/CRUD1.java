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
	JLabel lblPID, lblName, lblAddress;
	JTextField txtPID, txtName, txtAddress;
	JButton btnSave, btnClose;
	
	public CRUD1() {
		setTitle("CRUD-1");
		setSize(350, 350);
		setResizable(false);
		
		lblPID = new JLabel("PID ");
		lblPID.setBounds(20, 20, 70, 30);
		txtPID = new JTextField("Enter id");
		txtPID.setBounds(50, 30, 100, 30);
		
		lblName = new JLabel("Name: ");
		lblName.setBounds(20, 60, 70, 30);

		lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(20, 100, 70, 30);
		
		
		btnSave = new JButton("Save");
		btnSave.setBounds(20, 140, 70, 30);
		btnSave.addActionListener(this);
		
		btnClose = new JButton("Close");
		btnClose.setBounds(90, 140, 70, 30);
		btnClose.addActionListener(this);
		
		setLayout(null);
		add(lblPID);
		add(lblName);
		add(lblAddress);
		
		add(txtPID);
		add(btnSave);
		add(btnClose);
		
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
				JOptionPane.showMessageDialog(this, "Error to  rsaveecord ");

			}
			}
	}




}
