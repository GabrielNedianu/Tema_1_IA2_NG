package tema1_6;

import java.util.ArrayList;

public class Curs {
	public Profesor getProfesorCurs() {
		return profesorCurs;
	}
	private void setProfesorCurs(Profesor profesorCurs) {
		this.profesorCurs = profesorCurs;
	}
	public ArrayList<Student> getStudentiCurs() {
		return studentiCurs;
	}
	public Curs()
	{
		
	}
	public Curs(Profesor profesor,ArrayList<Student> studenti) {
		profesorCurs = profesor;
		studentiCurs = studenti;
	}
	protected Profesor profesorCurs;
	protected ArrayList<Student> studentiCurs;
	
	public void addStudentCurs(Student studentDeAdaugat) {
		this.studentiCurs.add(studentDeAdaugat);
	}
	public void addProfesorCurs(Profesor profesorDeAdaugat) {
		this.setProfesorCurs(profesorDeAdaugat);
	}
}
