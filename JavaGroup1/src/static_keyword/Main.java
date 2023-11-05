package static_keyword;

public class Main {
	public static void main(String[] args) {
		Friend frn1 = new Friend("Rabin");		// value passed to Friend function
		Friend frn2 = new Friend("Henry");		// 
		
//		System.out.println(Friend.numoffriends);	// Friend class call and display
		
		Friend.displayFriends();// call display function
		
	}

}
