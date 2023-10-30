package methods;

public class Return_Type {
	
	public static void main(String[] args) {
		int x = 4;
		int y= 3;
		
		int display = add(x, y);
		System.out.println(display);
	}
	
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

}
