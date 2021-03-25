package tema1_18;

import java.util.Comparator;

public class StudentsMedieComparator implements Comparator<Student> {
		
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getMedie(), o2.getMedie());
	}
}
