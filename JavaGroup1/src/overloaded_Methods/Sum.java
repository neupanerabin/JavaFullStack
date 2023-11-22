package overloaded_Methods;

public class Sum {
	
	public int sum(int a, int b) {
		return(a + b);
	}
	public double sum(double a, double b) {
		return(a + b);
		
	}
	public float sum(float a, float b, float c) {
		return(a + b +c);
	}
	
	public static void main(String [] args) {
		Sum s = new Sum();
        System.out.println (s.sum (10, 20, 30));

		System.out.println (s.sum (1, 0));
		System.out.println (s.sum (10, 20));
        System.out.println (s.sum (10, 20, 30));
        System.out.println (s.sum (10.5, 20.5));
	}

}
