package week3.Day3;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
		int start=1;
		int end=5;
		final int interval = 5000; // Milliseconds
		
		try {
			while(start<=end) {
				System.out.println(start);
				Thread.sleep(interval);
				start++;
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
		
	}

}
