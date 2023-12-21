package Dao.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Dao.DatabaseInformation;
import Dao.Users;

public class UserDaoImpl implements UserDao{

	@Override
	public List<Users> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users get(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Users user) throws SQLException {
		Connection conn = DatabaseInformation.getDatabaseConnection();

	    // Use a parameterized query to prevent SQL injection
	    String insert = "INSERT INTO product (productId, productName, productCatId, price) VALUES (?, ?, ?, ?)";
	    PreparedStatement ps = conn.prepareStatement(insert);

	    // Set values for the parameters in the prepared statement
	    ps.setInt(1, user.getId());
	    ps.setString(2, user.getName());
	    ps.setString(3, user.getAddress());
	    ps.setDouble(4, user.getContactNumber());

	    // Execute the update
	    int rowsAffected = ps.executeUpdate();

	    // Close resources
	    ps.close();
	    conn.close();

	    return rowsAffected;
	}

	@Override
	public int update(Users user, String userId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String UserId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
