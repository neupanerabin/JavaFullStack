package map.hashMap;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Register {

	Register() {
		Map<String, String> registerData = new HashMap<>();

	}

	void Registers() {
//        Map<String, String> registerData = new HashMap<>();

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

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);

		button.addActionListener(new ActionListener() {
			Map<String, String> registerData = new HashMap<>();

			public void actionPerformed(ActionEvent e) {
				String enteredUsername = username.getText();
				String enteredPassword = new String(passwords.getPassword());

				// Check if the username already exists

				if (registerData.containsKey(enteredUsername)) {
					JOptionPane.showMessageDialog(frame, "Username already exists. Choose a different username.");
				} else {
					// Register the user by adding to the HashMap
					registerData.put(enteredUsername, enteredPassword);
					JOptionPane.showMessageDialog(frame, "Registration successful for user: " + enteredUsername);

					writeToFile(registerData, "registration.txt");
				}
			}
		});

	}

	private void writeToFile(Map<String, String> data, String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			for (Map.Entry<String, String> entry : data.entrySet()) {
				writer.write(entry.getKey() + ":" + entry.getValue());
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
