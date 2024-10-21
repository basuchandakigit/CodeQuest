package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by name using Comparable
        Collections.sort(students);
        System.out.println("\nAfter Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by age using Comparator
        Collections.sort(students, new AgeComparator());
        System.out.println("\nAfter Sorting by Age:");
        for (Student student : students) {
            System.out.println(student);
        }
    
		

	}

}
