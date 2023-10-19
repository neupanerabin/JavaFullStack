package Random;

public class RandomTest {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        
        int x = random.nextInt(11);	// pick numbers unto 11 
        double y = random.nextDouble();
        System.out.println(y);
    }
}
