package gui_checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import myLibrary.BasicIo;

public class Checkbox implements ActionListener{
	JButton button;
	JCheckBox checkBox;

	
	Checkbox(){
		
		// Frame implementation
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());	// set layout manager to FlowLayout
		
		// JButton
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);	// Register actionListener for the button
		
		// CheckBox used and implementation
		checkBox = new JCheckBox();
		checkBox.setText("I am not a robot");	// text in the checkbox
		checkBox.setFont(new Font("Consolas", Font.BOLD,33));	// font type and size
		checkBox.setFocusable(false);
		 
		//Add to the frame
		frame.add(button); 
		frame.add(checkBox);	// check box add to the frame
		frame.pack();	// pack components for proper sizing
		frame.setVisible(true);	// visible to the frame
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
		
	}

}
