package curso.java.exercicios.enumerator2.application;

import curso.java.exercicios.enumerator2.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();

        Date moment = new Date();
        Order order = new Order(moment, status, new Client(clientName,email,birthDate));

        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();
        for (int i = 1; i <= numItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price,new Product(productName, price));
            order.addItem(orderItem);
        }
        System.out.println(order);
    }
}
