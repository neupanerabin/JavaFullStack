package Variables;

import java.util.Random;

public class DiceRoller {
	Random random;
	int number = 0;
	
	DiceRoller(){
		 random = new Random();
		rollRandom(random, number);
		
	}
	
	void rollRandom (Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
		
	}

}
