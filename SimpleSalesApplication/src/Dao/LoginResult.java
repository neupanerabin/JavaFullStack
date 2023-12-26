package Dao;

public class LoginResult {

    private final boolean loginSuccessful;
    private final String userType;

    public LoginResult(boolean loginSuccessful, String userType) {
        this.loginSuccessful = loginSuccessful;
        this.userType = userType;
    }

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    public String getUserType() {
        return userType;
    }

    /**
     * Gets the key associated with this login result.
     *
     * @return The key associated with the login result.
     */
    public boolean getKey() {
        // For example, use a combination of login success and user type as the key.
        return isLoginSuccessful() && getUserType() != null && !getUserType().isEmpty();
    }

    /**
     * Gets the value associated with this login result.
     *
     * @return The value associated with the login result.
     */
    public String getValue() {
        // For example, return the user type as the value.
        return getUserType();
    }

    /**
     * Checks if the user is an admin.
     *
     * @return True if the user is an admin; otherwise, false.
     */
    public boolean isAdmin() {
        // For example, check if the user type is "admin."
        return "admin".equalsIgnoreCase(getUserType());
    }

    // Add other methods as needed based on your application requirements.
}
