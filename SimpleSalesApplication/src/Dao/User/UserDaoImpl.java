package Dao.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Dao.DatabaseInformation;
import Dao.Users;
import Dao.Login;
import Dao.LoginResult;

public  class UserDaoImpl implements UserDao {

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
	public Dao.LoginResult loginCheck(String username, String password, String usertype) throws SQLException {

		Connection conn = DatabaseInformation.getDatabaseConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean loginSuccessful = false;

//		Login loginFields = new Login();

		try {

			// Use a parameterized query to prevent SQL injection
	        String selectQuery = "SELECT * FROM user WHERE username = ? AND password = ? AND usertype = ?";
			ps = conn.prepareStatement(selectQuery);

			// Set values for the parameters in the prepared statement
	        ps.setString(1, username);
	        ps.setString(2, password);
	        ps.setString(3, usertype);

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
			// Close resources in a finally block to ensure they are closed even if an
			// exception occurs
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
		return new LoginResult(loginSuccessful, usertype);
//		return loginSuccessful;

	}

	private boolean showLogin() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Login");
		return false;
	}

	

public boolean changePassword(String username, String newPassword) throws SQLException {
    Connection conn = DatabaseInformation.getDatabaseConnection();
    PreparedStatement ps = null;

    try {
        // Use a parameterized query to prevent SQL injection
        String updateQuery = "UPDATE user SET password = ? WHERE username = ?";
        ps = conn.prepareStatement(updateQuery);

        // Set values for the parameters in the prepared statement
        ps.setString(1, newPassword);
        ps.setString(2, username);

        // Execute the update
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Password changed successfully.");
            return true;
        } else {
            System.out.println("Failed to change password. User not found.");
            return false;
        }

    } catch (SQLException e) {
        // Handle any SQL exceptions here
        e.printStackTrace();
    } finally {
        // Close resources in a finally block to ensure they are closed even if an exception occurs
        try {
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
    return false; // Moved inside the finally block
}

	@Override
	public boolean LoginResult(String username, String password, String usertype) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loginCheck() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	
}
