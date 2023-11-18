package gui_progressbar;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	
	JFrame frame;
	JProgressBar bar;
	
	ProgressBarDemo(){
		// Initialize JFrame and JProgressBar
		frame = new JFrame();
		bar = new JProgressBar();
		
		// Set initial values and properties for the JProgressBar
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 200);
		bar.setStringPainted(true); // Display percentage completion as text
		bar.setBackground(Color.red);	// set the background color

		
		// Add the JProgressBar to the JFrame
		frame.add(bar);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 500);
		frame.setLayout(null); // Set layout manager to null for manual component placement
		frame.setVisible(true);
		
		// Call the method to simulate filling progress in the JProgressBar
		fill();
	}

	// Method to simulate filling progress in the JProgressBar
	public void fill() {
		int counter = 100;
		
		// Increment the JProgressBar value and sleep to simulate progress
		while(counter <= 100) {
			bar.setValue(counter);
			try {
				Thread.sleep(100); // Sleep for 100 milliseconds to slow down the progress
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter += 1; 
		}
		bar.setString("Done! ");
	}
}
