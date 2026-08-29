package Opps;

import java.util.Arrays;
import java.util.List;

public class StudentAppln {

    public static void displayStudent(Student student) {

        System.out.println("Regno        : " + student.getRegno());
        System.out.println("Student name : " + student.getName());
        System.out.println("Total avg    : " + student.getAverage());
        System.out.println("Result       : " + student.getResult());
        System.out.println();
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("bt22cse017", "Avinash", 30, 90, 95),
            new Student("bt22mec013", "Adi", 70, 100, 95),
            new Student("bt22civ012", "Anuoshka", 50, 40, 97)
        );

        for (Student student : students) {
            displayStudent(student);
        }
    }
}