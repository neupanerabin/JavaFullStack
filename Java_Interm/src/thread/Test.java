package thread;


/*
 * @author : rabin
 */


public class Test {
    static final int MAX = 5; // Maximum number to print

    public static void main(String[] args) {
        Printer printer = new Printer(); // Shared resource
        // Create and start threads
        Thread oddThread = new Thread(new Odd_Number(printer, MAX, false), "OddThread");
        Thread evenThread = new Thread(new Odd_Number(printer, MAX, true), "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}