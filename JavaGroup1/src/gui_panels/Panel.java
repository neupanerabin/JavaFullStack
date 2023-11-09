package gui_panels;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public class Panel {
	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("file:///Users/rabin/eclipse-workspace/JavaGroup1/src/gui_labels/img2.png");
		
		JLabel label = new JLabel();
		label.setText("Hello :");
		label.setIcon(icon);
		label.setBounds(250, 250, 250, 250);

		
		// Panel created
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);	// background color
		redpanel.setBounds(0, 0, 250, 250);	// position height, width of the panel
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(250,0,250,250);
		 
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 250, 500, 250);
		
		// Frame created
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// close
		frame.setLayout(null);
		frame.setSize(700, 700);
		frame.setTitle("Hello");
		frame.add(label);



		frame.add(redpanel);	// panel insert to the frame
		frame.add(greenPanel);
		frame.add(bluePanel);
		
		frame.setVisible(true);

		
		
	}

}
