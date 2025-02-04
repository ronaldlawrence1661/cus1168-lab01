package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // TODO - Filtering: Students with GPA > 3.0
        List<Student> StudentsGPA = students.stream() 
                .filter(student -> student.getGpa() > 3.0)
                .collect(Collectors.toList());
        // TODO - Mapping: Extract names of students with GPA > 3.0
        System.out.println("Students with GPA > 3.0:");
        StudentsGPA.forEach(student -> System.out.println(student));
        System.out.println("Names of students with GPA > 3.0:");
        GPANames.forEach(System.out::println);
        // TODO - Reducing: Calculate the average GPA of all students
        double averageGPA = students.stream()
        .mapToDouble(Student::getGpa)
        .average()
        .orElse(0.0);
        System.out.println("Average GPA of all students: " + averageGPA);
        // TODO Collecting: Collect all "Junior" students into a list
        List<Student> juniorStudents = students.stream()
        .filter(student -> student.getCollegeYear().equals("Junior"))
        .collect(Collectors.toList());
        System.out.println("Junior students:");
        juniorStudents.forEach(student -> System.out.println(student));
    }
}
