package jdbc;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

public class MainConnection {
	public static void main(String[] args) throws SQLException {

		ProductDAOImpl prodImpl = new ProductDAOImpl();

		// Display 
		List<Products> productList = prodImpl.getAll();
		System.out.println(productList);

		// Call the insert method
		Products product = new Products("Lc4", "Accer Aspire", "Ed3", 88);
		int rowsAffected = prodImpl.insert(product);
		// Print the number of rows affected by the insertion
		System.out.println("Rows Affected: " + rowsAffected);

	}

}
