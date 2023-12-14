package generics;

import java.util.ArrayList;
import java.util.List;

public class ProducerExtends {

    class Fruit {
        @Override
        public String toString() {
            return "I am a Fruit !!";
        }
    }

    class Apple extends Fruit {
        @Override
        public String toString() {
            return "I am an Apple !!";
        }
    }

    public static void main(String[] args) {
        // List of apples
        List<Apple> apples = new ArrayList<>();
        apples.add(new ProducerExtends().new Apple());

        // We can assign a list of apples to a basket of fruits;
        // because apple is a subtype of fruit
        List<? extends Fruit> basket = apples;

        // Here we know that in the basket there is nothing but fruit only
        for (Fruit fruit : basket) {
            System.out.println(fruit);
        }

        // basket.add(new Apple()); //Compile-time error
        // basket.add(new Fruit()); //Compile-time error
    }
}
