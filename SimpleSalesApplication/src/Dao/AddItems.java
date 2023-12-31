package Dao;

import java.sql.SQLException;
import java.util.Scanner;

import Dao.User.UserDaoImpl;

public class AddItems {
	

		private UserDaoImpl userImpl = new UserDaoImpl();
		private Scanner scanner = new Scanner(System.in);
		private String productsName;
		private String productsPrice;
	

	public String getProductsName() {
		return productsName;
	}

	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}

	public String getProductsPrice() {
		return productsPrice;
	}

	public void setProductsPrice(String productsPrice) {
		this.productsPrice = productsPrice;
	}
	public void additems() {
		
		while(true) {
			
			System.out.println("Product Name");
			String name = scanner.nextLine();
			
			System.out.println("Price: ");
			float price = scanner.nextFloat();
			
			
			try {
                boolean rowsAffected = userImpl.additems(name, price);
                // Print the number of rows affected by the insertion
                System.out.println("Rows Affected: " + rowsAffected);
            } catch (SQLException e) {
                e.printStackTrace();
            }
			
			
			
		}
		
		
		
	}

}
