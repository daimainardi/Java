package curso.java.aluno.application;

import curso.java.aluno.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter the student's name: ");
        student.name = sc.nextLine();

        System.out.print("Enter first quarter grade: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Enter second quarter grade: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Enter third quarter grade: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() > 60){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }
    }
}
