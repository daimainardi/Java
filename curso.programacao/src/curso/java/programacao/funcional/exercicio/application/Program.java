package curso.java.programacao.funcional.exercicio.application;

import curso.java.programacao.funcional.exercicio.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        //home/daiane/desenvolvimento/curso-java-udemy/in6.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.print("Enter salary: ");
            Double salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> email = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .collect(Collectors.toList());
            email.forEach(System.out::println);

            Double sumSalary = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, (x, y) -> x + y);
            System.out.print("Sum of salary of people whose name starts with 'M': "
                    + String.format("%.2f", sumSalary));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
