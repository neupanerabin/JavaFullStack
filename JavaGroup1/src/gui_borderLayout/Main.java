 package gui_borderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));

		
		JPanel panel1 = new JPanel();	// create panel objects
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// include colors in the different panels
		panel1.setBackground(Color.red);	
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.black);
		panel5.setBackground(Color.gray);
		
		// put grid dffferent dimensions
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//------------- sub -panel -----------
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.DARK_GRAY);
		panel8.setBackground(Color.lightGray);
		panel9.setBackground(Color.MAGENTA);
		panel10.setBackground(Color.orange);
		
		panel5.setLayout(new BorderLayout());
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		// include all the new grid in the 
		// central Grid 
		panel5.add(panel6,BorderLayout.SOUTH);
		panel5.add(panel7,BorderLayout.EAST);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.CENTER);
		panel5.add(panel10,BorderLayout.NORTH);


		
		//------------- sub -panel -----------

		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST); 
		frame.add(panel4,BorderLayout.SOUTH); 
		frame.add(panel5,BorderLayout.CENTER); 
		
		frame.setVisible(true);




	}

}
