package Dao;

import java.sql.SQLException;
import java.util.List;

public interface Generics<T> {
	List<T> getAll() throws SQLException;

	T get(String userId) throws SQLException;

	int insert(Users user) throws SQLException;

	int update(T user, String userId) throws SQLException;

	int delete(String UserId) throws SQLException;
	
	boolean changePassword(String username, String password) throws SQLException;

	boolean LoginResult(String username, String password, String usertype) throws SQLException;

	Dao.LoginResult loginCheck(String username, String password, String usertype) throws SQLException;


}
