package week2.day2;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyWindow {
	
	JFrame frame;
	JTextField txt1, txt2, txt3;
	JButton btnAdd;
	
	public MyWindow() {
		frame = new JFrame("Register");
		
		
		txt1 = new JTextField();
		txt1.setBounds(20, 20, 120, 25);
		
		txt2 = new JTextField();
		txt2.setBounds(20, 50, 75, 25);
		
		txt3 = new JTextField("");
		txt3.setBounds(20, 80, 120, 25);
		
		btnAdd=new JButton();
		btnAdd.setText("ADD");
		btnAdd.setBounds(30, 10,75, 25);
		
		frame.add(txt1);
		frame.add(txt2);
		frame.add(txt3);
		frame.add(btnAdd);
		
		
		frame.setSize(650, 740);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MyWindow();
		
	}

}
