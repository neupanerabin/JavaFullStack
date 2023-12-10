package hashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {
	
	Register(){
		
	}
	
	void Registers() {
		JLabel user, password;

		JFrame frame = new JFrame(); // create frame

		user = new JLabel("username: ");
		user.setBounds(30, 50, 100, 30);
		
		JTextField username = new JTextField();
		username.setBounds(100, 50, 100, 30);
		
		password = new JLabel("Password: ");
		password.setBounds(30, 80, 100, 30);
		
		JPasswordField passwords = new JPasswordField();
		passwords.setBounds(100, 80, 100, 30);
		
		JButton button = new JButton("Register");
		button.setBounds(80, 110, 90, 30);
		frame.add(button);

		// add user and password files in the frame
		frame.add(user);	
		frame.add(username);
		
		// add password and password fields in the frame
		frame.add(password);
		frame.add(passwords);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
