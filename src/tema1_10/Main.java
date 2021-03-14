package tema1_10;


public class Main {
	public static void main(String args[]) {
		SegmentDeDreapta segmentDeDreapta = new SegmentDeDreapta();
		Patrat patrat = new Patrat();
		Cerc cerc = new Cerc();
		Cub cub = new Cub();
		Sfera sfera = new Sfera();
		segmentDeDreapta.lungimeDreapta();
		patrat.getAria();
		cerc.getPerimetru();
		cub.getVolum();
		sfera.getPerimetru();
	}
}

/*	UML 
 * 	
 * 	Shape3D->extends->Shape2D->extends->Shape
 * 
 *  SegmentDeDreapta->implements->Shape
 *  
 *  Patrat->implements->Shape2D
 *  Cerc->implements->Shape2D
 *  
 * 	Cub->implements->Shape3D
 *  Sfera->implements->Shape3D
 */
