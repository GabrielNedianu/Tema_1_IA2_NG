package tema1_6;

public class Adresa {
	protected String strada;
	protected int numarStrada;
	
	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public int getNumarStrada() {
		return numarStrada;
	}

	public void setNumarStrada(int numarStrada) {
		this.numarStrada = numarStrada;
	}

	Adresa(String string,int nr){
		strada = string;
		numarStrada = nr;
	}
}
