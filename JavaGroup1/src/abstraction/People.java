package abstraction;

public class People {

	private String name;

	public People(String nm) {
		this.name = nm;
	}

	public static void main(String[] args) {

		People p1 = new People("rabin");

		System.out.println(p1.name);
	}
}
