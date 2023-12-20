package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public List getAll()  throws SQLException{
		List<Products> productList = new ArrayList<>();
		Connection conn = DatabaseConnection.getDatabaseConnection();
		
		String display = "select * from product";
		PreparedStatement ps = conn.prepareStatement(display);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String productId = rs.getString(2);
			String productName = rs.getString(3);
			String productCatId = rs.getString(4);
			Float price = rs.getFloat(5);
			
			
			Products product = new Products(id, productId,productName, productCatId, price);
			
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
	public int insert(Object product) {
		// TODO Auto-generated method stub
		return 0;
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
