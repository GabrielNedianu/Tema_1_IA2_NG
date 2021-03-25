package tema1_18;

import generatorRanom.GeneratorRandom;

public class Student {

	private String nume;
	private double medie;
	
	public double getMedie() {
		return medie;
	}

	public void setMedie(double medie) {
		this.medie = medie;
	}

	public String getNume() {
		return nume;
	}

	Student(){
		this.nume=GeneratorRandom.generareNume();
		this.medie=GeneratorRandom.generareDouble(10);
		if(this.medie < 2.0)
		{
			this.medie = this.medie + 3;
		}
	}
	
	public void afisare() {
		System.out.println("Student: "+nume+" cu media = "+String.format("%.2f", medie));
	}
}
