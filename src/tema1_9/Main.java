package tema1_9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cerc> cercul = new ArrayList<Cerc>();
		cercul.add(new Cerc(2));
		cercul.add(new Cerc(3));
		cercul.add(new Cerc((float) 4.2));
		cercul.add(new Cerc((float) 2.3));
		for(int i=0;i<cercul.size();i++) {
			System.out.println(cercul.get(i).getArea());
		}
	}

}
