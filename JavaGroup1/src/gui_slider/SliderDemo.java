package gui_slider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{
	// Global declaration
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider demo");	// add title to frame
		panel = new JPanel();
		label = new JLabel();
        slider = new JSlider(0, 100, 50); // Slider with a range from 0 to 100 and starting at 50

		
		// slider position
		slider.setPreferredSize(new Dimension(400,300));
		slider.setPaintTicks(true);
		
		slider.setMajorTickSpacing(10); // display tricks every 10 
		slider.setPaintTrack(true);
		
		slider.setMajorTickSpacing(25);	// display tricks every 10 
		slider.setPaintLabels(true);
		
		slider.setFont(new Font("MV Boil", Font.ITALIC,22));
        slider.addChangeListener(this); // Register the SliderDemo class as a listener for slider events
		
		panel.add(slider);	// add slider to panel
		panel.add(label);	// add label to panel
		frame.add(panel);	// add panel to frame
		frame.setSize(420, 420);	// set the frame size
		frame.setVisible(true);		// frame visible to display
		
		
		
	}
	// Methods called when the state of the slider changes
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("0 = " + slider.getValue());
	}
 
}
