package map.hashMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Login extends JFrame {

	private JTextField usernameField;
	private JPasswordField passwordField;

	Login() {
	}

	void login() {
		// Simulating a simple username-password database
		Map<String, String> userDatabase = readFromFile("registration.txt");

		
		// Creating Swing components
		JLabel usernameLabel = new JLabel("Username:");
		JLabel passwordLabel = new JLabel("Password:");
		usernameField = new JTextField();
		passwordField = new JPasswordField();
		JButton loginButton = new JButton("Login");

		// Setting layout
		setLayout(new GridLayout(3, 3));

		// Adding components to the frame
		add(usernameLabel);
		add(usernameField);
		add(passwordLabel);
		add(passwordField);
		add(loginButton);

		// Adding ActionListener to the login button
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Taking user input for username and password
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());

				// Check if the entered credentials are valid
				if (authenticateUser(username, password, userDatabase)) {
					JOptionPane.showMessageDialog(null, "Login successful");
				} else {
					JOptionPane.showMessageDialog(null, "Login failed");
				}
			}
		});

		// Set frame properties
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(null); // Center the frame
		setVisible(true);
	}

	private Map<String, String> readFromFile(String filename) {
		Map<String, String> data = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(":");
				if (parts.length == 2) {
					data.put(parts[0], parts[1]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	private boolean authenticateUser(String username, String password, Map<String, String> userDatabase) {
		// Check if the username exists in the database and if the password matches
		return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
	}

}
