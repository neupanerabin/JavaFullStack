 package gui_LayredPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayredPane {

	public static void main(String[] args) {
		
		// Label is created
		JLabel label1 = new JLabel();
		label1.setOpaque(true);			// makes visible to the frame
		label1.setBackground(Color.red);
		label1.setBounds(50,50, 200,200);
		
		// JLabel2 is created
		JLabel label2 = new JLabel();
		label2.setOpaque(true);			// makes visible to the frame
		label2.setBackground(Color.green);
		label2.setBounds(100,100, 200,200);
		
		//JLabel3 is created
		JLabel label3 = new JLabel();
		label3.setOpaque(true);				// makes visible to the frame
		label3.setBackground(Color.blue);
		label3.setBounds(150,150, 200,200);
		
		// JLayeredPane created
		JLayeredPane layeredpane = new JLayeredPane();
		layeredpane.setBounds(0,0,500,500);	// bounds and dimensions
		
		layeredpane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label2);
		layeredpane.add(label3);
		
		JFrame frame = new JFrame("JLayredPane");	// frame object is created
		frame.add(layeredpane);	// layeredpane  add to the frame
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		frame.setVisible(true);
				
		
		
	}

}
