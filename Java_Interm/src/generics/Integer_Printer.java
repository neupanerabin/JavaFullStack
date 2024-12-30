package generics;


/*
 * @author : rabin
 */

import java.util.ArrayList;

public class Integer_Printer {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(11);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(11.6);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello Generics ! ");
        stringPrinter.print();


    }

}
