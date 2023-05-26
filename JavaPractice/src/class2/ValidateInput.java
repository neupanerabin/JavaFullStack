package class2;

// Validate user information using regular expression

public class ValidateInput {
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	// validate last name
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
	}
	
	// validate address
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+[a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z)+)");
	}
	// validate city
	public boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

}
