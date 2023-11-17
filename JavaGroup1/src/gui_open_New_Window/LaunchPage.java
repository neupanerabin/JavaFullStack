package gui_open_New_Window;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton mybutton = new JButton("New Window");
	
	
	LaunchPage(){
		
		mybutton.setBounds(100,160,200,40);	// set bounds to the window
		mybutton.setFocusable(false);
		mybutton.addActionListener(this);
		
		// frame work created
		frame.add(mybutton);	// Button added to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,500);
		frame.setLayout(null);	// 
		frame.setVisible(true);
	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mybutton) {
			frame.dispose();	// close the launch page and open new page only 
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
