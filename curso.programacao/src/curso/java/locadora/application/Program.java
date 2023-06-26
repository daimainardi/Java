package curso.java.locadora.application;

import curso.java.locadora.entity.CarRental;
import curso.java.locadora.entity.Vehicle;
import curso.java.locadora.service.BrazilTaxService;
import curso.java.locadora.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental details");
        String model = input("Car model: ");

        LocalDateTime start = LocalDateTime.parse(input("Start (dd/MM/yyyy hh:mm): "), fmt);
        LocalDateTime finish = LocalDateTime.parse(input("Finish (dd/MM/yyyy hh:mm): "), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));

        double pricePerHour = Double.parseDouble(input("Enter the price per hour: "));
        double pricePerDay = Double.parseDouble(input("Enter the price per day: "));

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic Payment: " + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f",carRental.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f",carRental.getInvoice().getTotalPayment()));
    }
    private static String input(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
