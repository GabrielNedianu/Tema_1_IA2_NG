package tema1_18;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int nr_studenti = 40;
		ArrayList<Student> student = new ArrayList<>();
		for (int i = 0; i < nr_studenti ; i++) {
			student.add(new Student());
		}
		for (Student studentul : student) {
			studentul.afisare();
		}
		StudentsMedieComparator comparator = new StudentsMedieComparator();
		Collections.sort(student, comparator);
		System.out.println("Medii ordonate: ");
		for (Student studentul : student) {
			studentul.afisare();
		}
		//Arrays.sort(student,comparator);
		//Arrays.sort(student.comparator);
	}

}
