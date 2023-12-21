package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public List getAll() throws SQLException {
		List<Products> productList = new ArrayList<>();
		Connection conn = DatabaseConnection.getDatabaseConnection();

		String display = "select * from product";
		PreparedStatement ps = conn.prepareStatement(display);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int id = rs.getInt(1);
			String productId = rs.getString(2);
			String productName = rs.getString(3);
			String productCatId = rs.getString(4);
			Float price = rs.getFloat(5);

			Products product = new Products(productId, productName, productCatId, price);

			productList.add(product);

		}

		return productList;
	}

	@Override
	public Object get(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Products product) throws SQLException {
	    Connection conn = DatabaseConnection.getDatabaseConnection();

	    // Use a parameterized query to prevent SQL injection
	    String insert = "INSERT INTO product (productId, productName, productCatId, price) VALUES (?, ?, ?, ?)";
	    PreparedStatement ps = conn.prepareStatement(insert);

	    // Set values for the parameters in the prepared statement
	    ps.setString(1, product.getProductId());
	    ps.setString(2, product.getProductName());
	    ps.setString(3, product.getProductCatId());
	    ps.setFloat(4, product.getPrice());

	    // Execute the update
	    int rowsAffected = ps.executeUpdate();

	    // Close resources
	    ps.close();
	    conn.close();

	    return rowsAffected;
	}


	@Override
	public int update(Object product, String productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String productId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
