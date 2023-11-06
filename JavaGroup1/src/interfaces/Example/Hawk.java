package interfaces.Example;

public class Hawk implements Predator {	// interface is implemented

	@Override
	public void hunt() {
		System.out.println("The hawk is hunt");
	}

}
