package gui_FlowLayout;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Flowlayer {

	public static void main(String[] args) {
		
		
		
		// JFrame setup
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING));	// Leading used to put in the left hand side in stick mode
		
		
		JButton button1 = new JButton("1");		// Button create
		frame.add(button1);	// Button add in frame
		
		frame.add(new JButton("2"));	// Button create and add in frame
		frame.add(new JButton("3"));	// Button create and add in frame
		frame.add(new JButton("4"));	// Button create and add in frame
		frame.add(new JButton("5"));	// Button create and add in frame
		frame.add(new JButton("6"));	// Button create and add in frame

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
