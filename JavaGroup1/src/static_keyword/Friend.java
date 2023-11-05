package static_keyword;

public class Friend {
	String name;
	static int numoffriends;	// static keyword created
	
	Friend(String nam){		// Friend function created
		this.name = nam;
		numoffriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+ numoffriends+" friends");
	}

}
