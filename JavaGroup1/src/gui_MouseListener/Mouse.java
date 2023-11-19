package gui_MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse implements MouseListener{
	
	JFrame frame;
	JLabel label;
	ImageIcon smile;
	Mouse(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		frame.add(label);
		
		frame.setVisible(true);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		System.out.println("You clicked the mouse");

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		label.setBackground(Color.green );


	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		label.setBackground(Color.RED);

		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered the mouse");
		label.setBackground(Color.gray);

		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exists a component
		System.out.println("You exited the mouse");
		label.setBackground(Color.cyan);

	}
	

}
