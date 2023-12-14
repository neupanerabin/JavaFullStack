package functionalInterface;

public interface MyFunctionalInterface {
	
	void myMethod(); // Abstract method

    // Other methods (default, static) are allowed in a functional interface

    default void anotherMethod() {
        // Default method implementation
    }

    static void staticMethod() {
        // Static method implementation
    }

}
