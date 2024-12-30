package collection;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private List<String> laptops;

    public Class() {
        laptops = new ArrayList<>();
        laptops.add("Mac");
        laptops.add("Windows");
    }

    public List<String> getLaptops() {
        return laptops;
    }

    public String setLaptop(String laptop) {
        laptops.add(laptop);
        return laptop;
    }

    public void displayLaptops() {
        System.out.println("List of laptops:");
        for (String laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public static void main(String[] args) {
        Class laptop = new Class();

        // Example of setting laptop using String
        String newLaptop = laptop.setLaptop("Linux");
        System.out.println("Added new laptop: " + newLaptop);

        // Example of getting the list of laptops
        List<String> laptops = laptop.getLaptops();
        System.out.println("\n List of laptops: " + laptops);

        // Display laptops using for-each loop
        laptop.displayLaptops();
        
        
    }
}
