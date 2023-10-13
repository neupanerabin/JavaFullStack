package frames;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import databaseConnection.DBinfo; 
import databaseConnection.MySqlConnection;
import javax.swing.JMenuItem;
import java.util.Calendar;
import java.util.Date;



public class Login extends JFrame{

	private JPanel contentPane;	// create Panel
	private JTextField txt_username;	// 
	private JPasswordField txt_password;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();	// create object of login
					frame.setVisible(true);		// visible activate 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	PreparedStatement pst = null;
	ResultSet rs = null;

	/**
	 * Create the frame.
	 */
	public Login(){
		
		Connection conn = MySqlConnection.getConnection();	// request for get connection

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// exit and close frame 
		setBounds(100, 100, 450, 300);	// overall frame size
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Login Form");	// label for login form
		lblSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSignUp.setBounds(136, 26, 154, 31);	// label location 
		contentPane.add(lblSignUp);		// add lblSignup to frame 
		
		// For username 
		JLabel lblLoginusername = new JLabel("Username:");	// display name
		lblLoginusername.setBounds(49, 78, 77, 16);		// position of username 
		contentPane.add(lblLoginusername);
		
		txt_username = new JTextField();	// text field for username
		txt_username.setBounds(161, 73, 130, 26);	// text field position
		contentPane.add(txt_username);	// add to frame
		
		// For password
		JLabel lblLoginPassword = new JLabel("Password:");	// Display password label
		lblLoginPassword.setBounds(49, 113, 77, 16);	// password position
		contentPane.add(lblLoginPassword);	// add to JFrame position
		
		txt_password = new JPasswordField();	// password field create
		txt_password.setBounds(161, 111, 130, 26);	// password field position
		contentPane.add(txt_password);	// add to frame
		
		// Division
		JLabel lblDivision = new JLabel("Select Division");	// label display 
		lblDivision.setBounds(49, 153, 93, 16);	// position of division
		contentPane.add(lblDivision);	// add to frame
		
		JComboBox txt_comboBox = new JComboBox();	// combo box select option
		txt_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Account"}));	// choice in combobox 
		txt_comboBox.setBounds(161, 145, 120, 27);	// Position of combobox
		contentPane.add(txt_comboBox);	// add to frame

		
		// Login Button Start
		JButton loginSubmitButton = new JButton("Login");	// Login button create
		loginSubmitButton.addActionListener(new ActionListener() {	//  apply action listener to login button
			public void actionPerformed(ActionEvent e) {
			
			String sql = "SELECT id, username, password, division from Users where(username=? and password =? and division =?)";	// select from table
			try {
				int count = 0;
				pst = conn.prepareStatement(sql);
				// get name from frame and match in database 
				pst.setString(1, txt_username.getText());	
				pst.setString(2, txt_password.getText());	// 
				pst.setString(3, txt_comboBox.getSelectedItem().toString());
				

				
				rs = pst.executeQuery();  // query execute from database
				while(rs.next()) {
					count = count + 1;
				}
				
				String access = (txt_comboBox.getSelectedItem().toString());
				
				
				if(access == "Admin") {
					if(count == 1) {
						JOptionPane.showMessageDialog(null,  " Login Successful ");	// Show the pop up box
						
					}else {
						JOptionPane.showMessageDialog(null, "wrong username and Password");
					}
				}			
				
			}catch(Exception es) {
				JOptionPane.showMessageDialog(null, es);
			}finally {
				try {
					// close all connection
					rs.close();
					pst.close();
					conn.close();
				}catch (Exception ex){
					System.out.println("Errors:"+ex);
					
				}
			}
			
			}
		});
		
		loginSubmitButton.setBounds(128, 188, 117, 29);	// login submit button position
		contentPane.add(loginSubmitButton);
		
		JMenuItem lvl_menu = new JMenuItem("File");
		lvl_menu.setBounds(6, 0, 58, 19);
		contentPane.add(lvl_menu);
		
		JMenuItem lbl_date = new JMenuItem("Date");
		lbl_date.setBounds(68, 0, 58, 19);
		contentPane.add(lbl_date);
		
		JMenuItem lbl_time = new JMenuItem("Time");
		lbl_time.setBounds(128, 0, 67, 19);
		contentPane.add(lbl_time);
		
			}
}
