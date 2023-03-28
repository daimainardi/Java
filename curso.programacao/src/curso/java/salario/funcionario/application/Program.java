package curso.java.salario.funcionario.application;

import curso.java.salario.funcionario.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.print("Employee: "+ employee.name);
        System.out.printf(", $ %.2f%n", employee.netSalary());

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.print("Updated data: "+ employee.name);
        System.out.printf(", $ %.2f%n", employee.netSalary());

    }
}
