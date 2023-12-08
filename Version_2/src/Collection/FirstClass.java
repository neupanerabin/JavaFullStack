package Collection;

class FirstClass {
	private int x;

	FirstClass(int x) {
		this.x = x;
	}

	public String toString() { // Change to String
		return "" + this.x;

	}

	// Get the value
	public int getX() {
		return x;
	}

	// Set the value
	public void setX(int x) {
		this.x = x;
	}

}
