package gui_labels;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JFrame;

public class Labels {
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();	// frame object is created
		JLabel label = new JLabel();	// Label created

		jFrame.setSize(400,500);	// frame size is created
		jFrame.setTitle("Name Form");	// Form title
		jFrame.setBackground(new Color (255,25,55));	// background Color
		
		label.setText("Bro, did you know How to code ?");	// set text of label
		jFrame.add(label);
		
		label.setBackground(new Color(123, 50, 255));
		label.setOpaque(true);

		jFrame.setVisible(true);	// make frame visible
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


