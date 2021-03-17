package Supliment;

public class AVehicul2R extends AutoVehicul {
	
	static double pow = 7.2;
	public AVehicul2R(double CapCil,String culoareMasina,String marcaMasina) {
		speed=0;
		this.CC=CapCil;
		this.culoare=culoareMasina;
		this.marca=marcaMasina;
	}
	public AVehicul2R() {
		speed=0;
		this.CC=0;
		this.culoare="";
		this.marca="";
	}
}
