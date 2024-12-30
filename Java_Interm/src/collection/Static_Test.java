package collection;

public class Static_Test {
	
	static int add(int num1, int num2) {
		return(num1 + num2);
		
	}
	public static void main(String[] args) {
		int result = add(1,2);
		System.out.println(result);
		Static_Test list = null;
		list.add(100,10);
		
	}

}
