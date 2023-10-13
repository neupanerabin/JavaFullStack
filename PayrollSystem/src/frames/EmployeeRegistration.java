package frames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;

public class EmployeeRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField txtEmail;
	private JTextField textContact;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textEmp;
	private JTextField textTempAddress;
	private JTextField textPermanentAddress;
	private JTextField textPostcode;
	private JTextField textField_3;
	private JTextField textStatus;
	private JTextField textDatehired;
	private JTextField textBasicSalary;
	private JTextField textJobTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRegistration frame = new EmployeeRegistration();
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
	public EmployeeRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setBounds(352, 10, 112, 36);
		contentPane.add(lblNewLabel);
		
		//First Name
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(26, 87, 81, 16);
		contentPane.add(lblFirstName);
		
		textFirstName = new JTextField();
		textFirstName.setBounds(129, 82, 130, 26);
		contentPane.add(textFirstName);
		textFirstName.setColumns(10);
		
		// Last Name
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(26, 125, 83, 16);
		contentPane.add(lblLastName);
		
		textLastName = new JTextField();
		textLastName.setBounds(129, 120, 130, 26);
		contentPane.add(textLastName);
		textLastName.setColumns(10);
		
		// Email
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(26, 163, 61, 16);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(129, 158, 130, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		// Contact no
		JLabel lblContact = new JLabel("Contact ");
		lblContact.setBounds(26, 201, 61, 16);
		contentPane.add(lblContact);
		
		textContact = new JTextField();
		textContact.setBounds(129, 196, 130, 26);
		contentPane.add(textContact);
		textContact.setColumns(10);
		
		//Gender
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(26, 242, 61, 16);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(128, 234, 72, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rbdtnFemale = new JRadioButton("Female");
		buttonGroup.add(rbdtnFemale);
		rbdtnFemale.setBounds(202, 234, 83, 23);
		contentPane.add(rbdtnFemale);
		
		//Employee id
		JLabel lblEmpid = new JLabel("Employee id");
		lblEmpid.setBounds(26, 52, 81, 16);
		contentPane.add(lblEmpid);
		
		textEmp = new JTextField();
		textEmp.setBounds(129, 45, 130, 30);
		contentPane.add(textEmp);
		textEmp.setColumns(10);
		
		// Temporary Address
		JLabel lblTempadd = new JLabel("Temporary Address");
		lblTempadd.setBounds(26, 287, 130, 16);
		contentPane.add(lblTempadd);
		
		textTempAddress = new JTextField();
		textTempAddress.setBounds(202, 282, 130, 26);
		contentPane.add(textTempAddress);
		textTempAddress.setColumns(10);
		
		// Permanent Address
		JLabel lblPermanantAdd = new JLabel("Permanent Address");
		lblPermanantAdd.setBounds(26, 331, 130, 16);
		contentPane.add(lblPermanantAdd);
		
		textPermanentAddress = new JTextField();
		textPermanentAddress.setBounds(187, 320, 130, 26);
		contentPane.add(textPermanentAddress);
		textPermanentAddress.setColumns(10);
		
		// Post Code
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setBounds(26, 377, 81, 16);
		contentPane.add(lblPostCode);
		
		textPostcode = new JTextField();
		textPostcode.setBounds(129, 372, 130, 26);
		contentPane.add(textPostcode);
		textPostcode.setColumns(10);
		
		//Department
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(320, 52, 97, 16);
		contentPane.add(lblDepartment);
		
		textField_3 = new JTextField();
		textField_3.setBounds(429, 47, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(12);
		
		//Status
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(320, 87, 61, 16);
		contentPane.add(lblStatus);
		
		textStatus = new JTextField();
		textStatus.setBounds(429, 82, 130, 26);
		contentPane.add(textStatus);
		textStatus.setColumns(10);
		
		// Date Hired
		JLabel lblDateHired = new JLabel("Date Hired:");
		lblDateHired.setBounds(320, 125, 97, 16);
		contentPane.add(lblDateHired);
		
		textDatehired = new JTextField();
		textDatehired.setBounds(429, 120, 130, 26);
		contentPane.add(textDatehired);
		textDatehired.setColumns(10);
		
		// Basic Salary
		JLabel lblBasicSalary = new JLabel("Basic Salary:");
		lblBasicSalary.setBounds(320, 163, 81, 16);
		contentPane.add(lblBasicSalary);
		
		textBasicSalary = new JTextField();
		textBasicSalary.setBounds(429, 158, 130, 26);
		contentPane.add(textBasicSalary);
		textBasicSalary.setColumns(10);
		
		// Job Title
		JLabel lblJobtitle = new JLabel("Job Title:");
		lblJobtitle.setBounds(320, 201, 61, 16);
		contentPane.add(lblJobtitle);
		
		textJobTitle = new JTextField();
		textJobTitle.setBounds(429, 196, 130, 26);
		contentPane.add(textJobTitle);
		textJobTitle.setColumns(10);
		
		// Add record Button
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.setForeground(new Color(0, 102, 0));
		btnAddRecord.setBounds(344, 287, 117, 60);
		contentPane.add(btnAddRecord);
		
		// Clear Button
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setBounds(474, 287, 117, 60);
		contentPane.add(btnClear);
	}
}
