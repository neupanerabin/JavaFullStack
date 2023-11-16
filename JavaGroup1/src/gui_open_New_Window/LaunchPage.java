package gui_open_New_Window;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton mybutton = new JButton("New Window");
	
	
	LaunchPage(){
		
		mybutton.setBounds(100,160,200,40);
		mybutton.setFocusable(false);
		mybutton.addActionListener(this);
		
		// frame work created
		frame.add(mybutton);	// Button add to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mybutton) {
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
