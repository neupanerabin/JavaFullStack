package gui_gridLayout;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
public class Grid {
	public static void main(String [] args) {
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// exit on close
		frame.setSize(500, 500); 	// frame sized
		// arranged in the single grid
		frame.setLayout(new GridLayout(3, 3,10,10));	//  rows and  columns
		
		// Different buttons add in the frame
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		
		frame.setVisible(true); 	// frame is visible to the windows
		
	}
	

}
