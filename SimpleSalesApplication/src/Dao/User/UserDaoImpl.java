package Dao.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Dao.DatabaseInformation;
import Dao.Users;
import Dao.Login;

public class UserDaoImpl implements UserDao{

	@Override
	public List<Users> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users get(String userId) throws SQLException {
		return null;
	}

	@Override
	public int insert(Users user) throws SQLException {
		Connection conn = DatabaseInformation.getDatabaseConnection();

	    // Use a parameterized query to prevent SQL injection
	    String insert = "INSERT INTO user (iduser, username, password, usertype) VALUES (?, ?, ?, ?)";
	    PreparedStatement ps = conn.prepareStatement(insert);

	    // Set values for the parameters in the prepared statement
	    ps.setInt(1, user.getId());
	    ps.setString(2, user.getUsername());
	    ps.setString(3, user.getPassword());
	    ps.setString(4, user.getUserType());

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

	@Override
	public boolean loginCheck() throws SQLException{
		Connection conn = DatabaseInformation.getDatabaseConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean loginSuccessful = false;
		
		Login loginFields = new Login();

		try {
		    conn = DatabaseInformation.getDatabaseConnection();

		    // Use a parameterized query to prevent SQL injection
		    String selectQuery = "SELECT * FROM user WHERE username = ? AND password = ?";
		    ps = conn.prepareStatement(selectQuery);

		    // Set values for the parameters in the prepared statement
		    ps.setString(1, loginFields.getUsername());
		    ps.setString(2, loginFields.getPassword());
		    ps.setString(3, loginFields.getUsertype());
		    

		    // Execute the query
		    rs = ps.executeQuery();

		    // Check if the result set has any rows (user credentials are valid)
		    if (rs.next()) {
		        loginSuccessful = true;
		        
		    }
		    

		} catch (SQLException e) {
		    // Handle any SQL exceptions here
		    e.printStackTrace();
		} finally {
		    // Close resources in a finally block to ensure they are closed even if an exception occurs
		    try {
		        if (rs != null) {
		            rs.close();
		        }
		        if (ps != null) {
		            ps.close();
		        }
		        if (conn != null) {
		            conn.close();
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

		// Return the boolean value to the login page
		return loginSuccessful;

	}

}
