package week1;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame{
	
	public MyWindow2() {
		setVisible(true);
		setTitle("My second window");  // set the title
		setSize(300, 400);             // height and width
		setResizable(false);           // fix the size of pop up window
		setVisible(true);              // frame shows 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String [] args) {
		new MyWindow2();
	}

}
