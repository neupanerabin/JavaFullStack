package map.hashMap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main implements ActionListener {
	static JButton login;
	static JButton register;
	static JButton exit;

	public static void main(String[] args) {

		JFrame frame = new JFrame(); // create frame

		register = new JButton("1. Register");
		register.setBounds(50, 30, 90, 40);
		frame.add(register);

		login = new JButton("2. Login ");
		login.setBounds(50, 70, 90, 40);
		frame.add(login);
		
		exit = new JButton("3. Exit");
		exit.setBounds(50, 110, 90, 40);
		frame.add(exit);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);

		Register register1 = new Register();	// create objects of register
		Login loginSearch = new Login();

		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This method will be called when the button is clicked
				register1.Registers();
			}
		});
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This method will be called when the button is clicked
				loginSearch.login();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This method will be called when the button is clicked
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
