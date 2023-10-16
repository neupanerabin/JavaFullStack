package gui;

import javax.swing.JOptionPane; // import library files

public class Joption_Pane {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Name: "); 	// user input in dialog box
		JOptionPane.showMessageDialog(null, "Hello " + name); 	// display with dialog box

		int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
		JOptionPane.showMessageDialog(null, "You are " + age);
		
		double number = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
		JOptionPane.showMessageDialog(null, "Your numbers " + number);
		
	}

}
