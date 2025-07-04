package thread;

/**
 * @author : rabin
 * Program to print odd and even numbers using two threads.
 */

public class Odd_Number implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenThread;

    // Constructor to initialize thread properties
    Odd_Number(Printer print, int max, boolean isEvenThread) {
        this.print = print;
        this.max = max;
        this.isEvenThread = isEvenThread;
    }

    @Override
    public void run() {
        int number = isEvenThread ? 2 : 1; // Start with 2 for even, 1 for odd
        while (number <= max) {
            if (isEvenThread) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2; // Increment by 2 for the next number
        }
    }
}

// Shared Printer class to manage synchronized access
class Printer {
    private boolean isOddTurn = true; // Flag to control thread execution

    // Method to print even numbers
    synchronized void printEven(int number) {
        while (isOddTurn) { // Wait if it's not the turn for even thread
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted state
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Even: " + number);
        isOddTurn = true; // Toggle turn to odd thread
        notifyAll();
    }

    // Method to print odd numbers
    synchronized void printOdd(int number) {
        while (!isOddTurn) { // Wait if it's not the turn for odd thread
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted state
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Odd: " + number);
        isOddTurn = false; // Toggle turn to even thread
        notifyAll();
    }
}

