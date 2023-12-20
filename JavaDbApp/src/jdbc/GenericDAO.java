package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
	
	List<Products> getAll() throws SQLException;
	
	T get(String productId) throws SQLException;
	
	int insert(T product) throws SQLException;
	
	int update(T product, String productId) throws SQLException;
	
	int delete(String productId) throws SQLException;

}
