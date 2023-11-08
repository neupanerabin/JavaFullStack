package gui;

import java.awt.Color;
import java.awt.Window;

import javax.swing.JFrame;

public class JFrames {
	public static void main(String[] args) {
		// JFrame = a GUI to add components

		JFrame frame = new JFrame();	// create new frame
		frame.setTitle("JFrame");		// title given
		frame.setSize(400, 400);		// set the size of the JFrame
		frame.setVisible(true);			// Make the frame visible
		
		frame.getContentPane().setBackground(new Color(123,50,250));;	// background color

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	// set the default close option

	}

}
