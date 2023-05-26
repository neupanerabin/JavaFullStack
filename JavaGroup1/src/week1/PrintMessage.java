package week1;

public class PrintMessage {
	public static void main(String[] args) {
		hello();
		hello("Metahorizon");
		hello();
		hello("Rabin Neupane");
		
	}
	
	public static void hello() {
		System.out.println("Hello from Hello");
		
	}
	public static void hello(String message) {
		System.out.println("Message : "+message);
	}

}
