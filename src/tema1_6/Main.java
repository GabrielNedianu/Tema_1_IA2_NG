package tema1_6;

import java.util.ArrayList;

/*class Person{
	void eat()
	{
		System.out.println(" Person -> eat");
	}
}
class Driver extends Person{
	@Override
	void eat() {
		super.eat();
		System.out.println("Driver -> eat");
	}
}

class Cop extends Person{
	@Override
	void eat() {
		super.eat();
		System.out.println("Cop -> eat");
	}
}

class Police extends Driver {
	@Override
	void eat() {
		super.eat();
	}
}*/

public class Main {

	public static void main(String[] args) {
		Adresa adresa = new Adresa(null, 0);
		Profesor profesor = new Profesor();
		Student student0 = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		
		ArrayList<Profesor> Profesori = new ArrayList<Profesor>();
		Profesori.add(profesor);
		ArrayList<Student> Studenti = new ArrayList<Student>();
		Studenti.add(student0);
		Studenti.add(student1);
		Studenti.add(student2);
		Curs curs = new Curs(Profesori.get(0),Studenti);
		curs.profesorCurs.schimbaAdresaProfesorului(adresa);
		curs.profesorCurs.setNume("Mitica");
		curs.profesorCurs.preda();
		for (Student student : curs.getStudentiCurs()) {
			student.setNume("student");
			student.invata();
		}
	}

}
