package curso.java.funcionarios.heranca.application;

import curso.java.funcionarios.heranca.entities.Employee;
import curso.java.funcionarios.heranca.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            Double additionalCharge;
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }

        }
        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : employeeList){
            System.out.println(emp.getName() + " - $ "
                    + String.format("%.2f", emp.payment()));
        }



    }
}
