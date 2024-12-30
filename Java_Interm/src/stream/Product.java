package stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Product {

	private String name;
	private double price;

	// Constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}'+"\n";
    }

	public static void main(String[] args) {

		//
		List<Product> myList = new ArrayList<>();

		myList.add(new Product("Mango", 50.0));
		myList.add(new Product("Apple", 60.0));
		myList.add(new Product("Banana", 30.0));
		myList.add(new Product("Grapes", 70.0));
		myList.add(new Product("Oeange", 40.0));
		myList.add(new Product("kiwi", 45.0));

		// Product with price less than 50
		List<Product> filterProducts = myList.stream().filter(product -> product.getPrice() < 50)
				.collect(Collectors.toList());
		System.out.println(filterProducts);
		
		// Find distinct product in names
		List<Product> distinctProducts = myList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctProducts);
		
		// Find the product with the highest and lowest price.

	}

}
