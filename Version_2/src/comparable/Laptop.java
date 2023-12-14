package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {
    private int ramSize;
    private int storage;
    private float processorSize;

    // Constructor
    public Laptop(int ramSize, int storage, float processorSize) {
        this.ramSize = ramSize;
        this.storage = storage;
        this.processorSize = processorSize;
    }

    // Getter methods
    public int getRamSize() {
        return ramSize;
    }

    public int getStorage() {
        return storage;
    }

    public float getProcessorSize() {
        return processorSize;
    }

    // Setter methods (if needed)
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setProcessorSize(float processorSize) {
        this.processorSize = processorSize;
    }

    @Override
    public int compareTo(Laptop o) {
         //Compare based on RAM size
        int ramComparison = Integer.compare(this.ramSize, o.getRamSize());
        if (ramComparison != 0) {
            return ramComparison;
//    	return this.getRamSize().compareTo(o.getRamSize());
        }

        // Compare based on storage
        int storageComparison = Integer.compare(this.storage, o.getStorage());
        if (storageComparison != 0) {
            return storageComparison;
        }

        // Compare based on processor size
        return Float.compare(this.processorSize, o.getProcessorSize());
    }

    public static void main(String[] args) {
    	/*
        // Example usage
//        Laptop laptop1 = new Laptop(8, 512, 2.4f);
//        Laptop laptop2 = new Laptop(16, 256, 3.0f);
//
//        // Compare laptops
//        int result = laptop1.compareTo(laptop2);
//        System.out.println("Comparison result: " + result);
    	*/
        
        List<Laptop> listofLaptop = new ArrayList<>();
        
        listofLaptop.add(new Laptop(8, 400, 1.25f));
        listofLaptop.add(new Laptop(32, 256, 1.25f));
        listofLaptop.add(new Laptop(16, 128, 1.25f));

        
        Collections.sort(listofLaptop);
        System.out.println(listofLaptop);
        
        Comparator<Laptop> storageSizeCompare = new Comparator<Laptop>() {
        	public int  compare(Laptop o1, Laptop o2) {
//        		return o1.getStorage().compareTo(o2.getStorage());
                return Integer.compare(o1.getStorage(), o2.getStorage());

        	}
        };
        System.out.println(listofLaptop);

        
        
    }

	@Override
	public String toString() {
		return "Laptop [ramSize=" + ramSize + ", storage=" + storage + ", processorSize=" + processorSize + "]";
	}
}
