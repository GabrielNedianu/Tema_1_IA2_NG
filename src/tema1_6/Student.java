package tema1_6;

public class Student extends Persoana {
	public void invata() {
		System.out.println("Elevul "+this.getNume()+" invata la ora.");
	}
	public void schimbaAdresaElevului(Adresa adrNoua) {
		this.setAdresaPersoana(adrNoua);
	}
}


