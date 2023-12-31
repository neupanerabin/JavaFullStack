package Dao;

import java.sql.SQLException;
import java.util.List;

public interface Generics<T> {
	List<T> getAll() throws SQLException;

	T get(String userId) throws SQLException;

	boolean insert(Users user) throws SQLException;

	int update(T user, String userId) throws SQLException;

	int delete(String UserId) throws SQLException;
	
	boolean changePassword(String username, String password, int iduser) throws SQLException;

	boolean LoginResult(String username, String password, String usertype) throws SQLException;

	Dao.LoginResult loginCheck(String username, String password, String usertype) throws SQLException;
	
	// Add Items
	boolean additems(String productName, float productPrice) throws SQLException;



}
