package interfaces.Example;

public class Fish implements Prey, Predator {		// used the both the class

	@Override
	public void hunt() {
		System.out.println("This fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("This is hunting bigger fish");
	}

}
