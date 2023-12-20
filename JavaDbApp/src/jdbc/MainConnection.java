package jdbc;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

public class MainConnection {
	public static void main(String[] args) throws SQLException{
		
		ProductDAOImpl prodImpl = new ProductDAOImpl();
		
		List<Products> productList = prodImpl.getAll();
		System.out.println(productList);
		
	}

}
