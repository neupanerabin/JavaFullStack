package Dao.User;

import java.sql.SQLException;

import Dao.Generics;
import Dao.Users;

public interface UserDao extends Generics <Users>{
	
	boolean loginCheck() throws SQLException;

}
