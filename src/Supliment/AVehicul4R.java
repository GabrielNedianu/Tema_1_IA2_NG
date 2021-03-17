package Supliment;

public class AVehicul4R extends AutoVehicul {
	
	static double pow = 4.2;
	public AVehicul4R(double CapCil,String culoareMasina,String marcaMasina) {
		speed=0;
		this.CC=CapCil;
		this.culoare=culoareMasina;
		this.marca=marcaMasina;
	}
	public AVehicul4R() {
		speed=0;
		this.CC=0;
		this.culoare="";
		this.marca="";
	}
}
