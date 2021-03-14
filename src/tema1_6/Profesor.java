package tema1_6;

public class Profesor extends Persoana {
	public void preda() {
		System.out.println("Profesorul "+this.getNume()+" preda ora.");
	}
	public void schimbaAdresaProfesorului(Adresa adrNoua) {
		this.setAdresaPersoana(adrNoua);
	}
	public Profesor() {
		super();
	}
}
