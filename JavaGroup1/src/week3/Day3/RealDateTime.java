package week3.Day3;

import java.time.LocalTime;

public class RealDateTime {

    public static void main(String[] args) {
        try {
            while (true) {
                LocalTime now = LocalTime.now();
                System.out.print("\r" + now);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("\nfinally");
        }
    }
}
