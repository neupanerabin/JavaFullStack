package hashMap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main implements ActionListener {
	static JButton login;
	static JButton register;

	public static void main(String[] args) {

		JFrame frame = new JFrame(); // create frame

		register = new JButton("1. Register");
		register.setBounds(50, 30, 90, 30);
		frame.add(register);

		login = new JButton("2. Login ");
		login.setBounds(50, 60, 90, 30);
		frame.add(login);

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
				loginSearch.Login();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
