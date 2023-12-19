package generics;

public class ConsumerSuper {
	
	class Fruit{
		@Override
		public String toString() {
			return "I am fruit";
		}
	}
	
	class Apple extends Fruit{
		@Override
		public String toString() {
			return "I am an apple";
		}
	}
	
	class MustangApple extends Apple{
		@Override
		public String toString() {
			return " Mustang Apple";
		}
	}
	
	

}
