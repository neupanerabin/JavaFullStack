package generics;

import java.util.ArrayList;
import java.util.List;

public class ConsumerSuperMain {

    public static void main(String[] args) {

        // List of Apples
        List<ConsumerSuper.Apple> apples = new ArrayList<>();
        apples.add(new ConsumerSuper().new Apple());

        List<? super ConsumerSuper.Apple> basket = apples;

        // Adding an instance of Apple to the basket
        basket.add(new ConsumerSuper().new Apple());

        // Adding an instance of MustangApple to the basket
        basket.add(new ConsumerSuper().new MustangApple());

        // Uncommenting the line below will result in a compilation error
        // basket.add(new ConsumerSuper().new Fruit());

    }
}
