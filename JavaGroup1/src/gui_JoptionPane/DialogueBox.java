package gui_JoptionPane;

import javax.swing.JOptionPane;

public class DialogueBox {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is some useless dialogue","title", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
	}

}
