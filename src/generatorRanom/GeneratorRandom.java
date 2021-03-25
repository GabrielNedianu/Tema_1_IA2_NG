package generatorRanom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeneratorRandom {
	
	static final ArrayList<String> maleArrayList = new ArrayList<>(Arrays.asList(
			"Matei","George","Gabriel","Mohamed","Valentin","Nicu","Steven", "Neena", "Lex", "Alexander", "Bruce", "David", "Valli", "Diana", "Nancy", "Daniel", "John", "Ismael", "Jose",
			" Manuel", "Luis", "Den", "Alexander", "Shelli", "Sigal", "Guy", "Karen", "Matthew", "Adam", "Payam", "Shanta", "Kevin", "Julia", "Irene", "James", "Steven", "Laura", "Mozhe", 
			"James", "TJ", "Jason", "Michael", "Ki", "Hazel", "Renske", "Stephen", "John", "Joshua", "Trenna", "Curtis", "Randall", "Peter", "John", "Karen", "Alberto", "Gerald", "Eleni", 
			"Peter", "David", "Peter", "Christopher", "Nanette", "Oliver", "Janette", "Patrick", "Allan", "Lindsey", "Louise", "Sarath", "Clara", "Danielle", "Mattea", "David", "Sundar", 
			"Amit", "Lisa", "Harrison", "Tayler", "William", "Elizabeth", "Sundita", "Ellen", "Alyssa", "Jonathon", "Jack", "Kimberely", "Charles", "Winston", "Jean", "Martha", "Girard", 
			"Nandita", "Alexis", "Julia", "Anthony", "Kelly", "Jennifer", "Timothy", "Randall", "Sarah", "Britney", "Samuel", "Vance", "Alana", "Kevin", "Donald", "Douglas", "Jennifer", 
			"Michael", "Pat", "Susan", "Hermann", "Shelley", "William" 
		));
	
	static public String generareNume(){
		Random random= new Random();
		int index = random.nextInt(maleArrayList.size());
		return maleArrayList.get(index);
	}
	
	static public int generareInt(int panaLa) {
		Random random = new Random();
		return random.nextInt(panaLa);
	}
	static public double generareDouble(int multiplyer) {
		Random random = new Random();
		return random.nextDouble() * multiplyer;
	}
}
