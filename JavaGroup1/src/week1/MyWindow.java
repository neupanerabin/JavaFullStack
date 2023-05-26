package week1;

import javax.swing.JFrame;     // system define class
public class MyWindow {
	public static void main(String[] args) {
		// how to use existing class?
		// Two technique we have to use existing class
		// by creating an object
		// by extending -inheritance
		
		JFrame frame;  // create an object
		frame = new JFrame();
		frame.setSize(300, 250);    // width and height
		frame.setTitle("My first window");
		frame.setResizable(false);
		frame.setVisible(true);     // display
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // close the pop up window
		
		
	}

}
