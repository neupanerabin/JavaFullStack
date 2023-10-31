
public class Printf {
	public static void main(String[] args) {
//		System.out.printf("This is a format string %d ", 123);
		
		boolean myBoolean = true;
		String mycahr = "Rabin";
		char cha = '@';
		double numbers = 1000;
		int myInt = 11;
		
		System.out.printf("%b",myBoolean);
		System.out.printf("%c", cha);
		System.out.printf("%s", mycahr);
		System.out.printf("%f", numbers);
		System.out.printf("%d", myInt);
		
		
		// width
		System.out.printf( "\n\n Hello %10s", mycahr);
		
		//precision 
		System.out.printf("\n We can give the numbers of decimal by using: %.3f", numbers);
		
		
		
		
	}

}
