package tema1_14;

import java.util.Random;

public class GeneratorIntRandom {
	static int generare() {
		Random random = new Random();
		return random.nextInt(100);
	}
}
