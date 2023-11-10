package gui_button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class Button extends JFrame implements ActionListener{
	
	JButton button;

	Button() {
		
		ImageIcon icon = new ImageIcon("like.png");

		button = new JButton(); //button object create
		button.setBounds(200, 100, 100, 150);	// button create
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setBackground(Color.red );
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null  );
		this.setSize(500, 500);	// frame size
		this.setVisible(true);	// frame visible
		this.add(button);	// button add to frame

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("button");
		}
	}

}
