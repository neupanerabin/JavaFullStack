package gui_textfield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

// class definition for the GUI frame
public class MyFrame extends JFrame implements ActionListener{
	
	// Global variable declarations
	JButton button;			// Button for submitting
	JTextField textfield;	// Text field for user input
	
	// Constructors for MyFrame class 
	MyFrame(){
		
		// this --> JFrame
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());	// set layout manager to flowLayout 
		
		// Button create 
		button = new JButton("Submit");
		button.addActionListener(this);		// Register an ActionListener for the button
		
		// Text field call and used
		textfield =  new JTextField();
		textfield.setPreferredSize(new Dimension(250,40));	// text area height and width
		textfield.setFont(new Font("Consolas",Font.PLAIN,35));	// font type and sized
		textfield.setBackground(Color.cyan);	// background color for text field
		
		this.add(textfield);	//add  textField to the frame
		this.add(button);	// add button to the frame
		this.pack(); 
		this.setVisible(true);	// Make the frame visible
	}

		// ActionListener implementation for handling button click
	@Override
	public void actionPerformed(ActionEvent e) {
        // Check if the source of the event is the button
		if(e.getSource() == button) {
			String te = textfield.getText();
			System.out.println(""+ te);
		}
	}

}
