package frames;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstname;
	private JTextField txtLastNmae;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, -6, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SignUp");		
		btnNewButton.setBounds(113, 267, 88, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblFirestName = new JLabel("First Name");	// First Name 
		lblFirestName.setBounds(35, 57, 92, 16);
		contentPane.add(lblFirestName);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(129, 52, 130, 26);
		contentPane.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		JLabel lblLastname = new JLabel("LastName");	// Last Name
		lblLastname.setBounds(35, 95, 92, 16);
		contentPane.add(lblLastname);
		
		txtLastNmae = new JTextField();
		txtLastNmae.setBounds(129, 85, 130, 26);
		contentPane.add(txtLastNmae);
		txtLastNmae.setColumns(10);
		
		// Email
		JLabel lblEmail = new JLabel("Email");	
		lblEmail.setBounds(35, 126, 61, 16);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 121, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		// Passwords
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(35, 154, 61, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(129, 154, 130, 26);
		contentPane.add(passwordField);
		
		//Gender 
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(35, 196, 61, 16);
		contentPane.add(lblGender);
		
		JRadioButton mRadioButton = new JRadioButton("Male");
		buttonGroup.add(mRadioButton);
		mRadioButton.setBounds(118, 192, 141, 23);
		contentPane.add(mRadioButton);
		
		JRadioButton radioButton = new JRadioButton("Female");
		buttonGroup.add(radioButton);
		radioButton.setBounds(118, 213, 141, 23);
		contentPane.add(radioButton);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setBounds(140, 6, 61, 16);
		contentPane.add(lblNewLabel);
		

	}
}
