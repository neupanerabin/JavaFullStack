package gui_labels;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.border.Border;

public class Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("images/img.jpeg"); // Image load
        Border border = BorderFactory.createLineBorder(Color.green, 4);

        JLabel label = new JLabel(); // Label created
        label.setText("Bro, did you know How to code ?"); // Set text of label
        label.setIcon(image); // Set the image icon for the JLabel
        label.setBackground(new Color(123, 50, 255)); // Background color for the whole area
        label.setOpaque(true); // Apply color to all the place
        label.setBorder(border); // Add a border to the label

        JFrame jFrame = new JFrame(); // Frame object is created
        jFrame.setSize(400, 500); // Frame size is set
        jFrame.setTitle("Name Form"); // Form title
        jFrame.setBackground(new Color(255, 25, 55)); // Background Color
        jFrame.add(label); // Add JLabel to JFrame
        jFrame.setVisible(true); // Make frame visible
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button will close the frame
    }
}
