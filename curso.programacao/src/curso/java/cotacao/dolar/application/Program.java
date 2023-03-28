package curso.java.cotacao.dolar.application;

import curso.java.cotacao.dolar.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarQuotation = sc.nextDouble();

        System.out.print("How many dollars will be bought?");
        double dollarAmount = sc.nextDouble();

        double reais = CurrencyConverter.converter(dollarAmount, dollarQuotation);

        System.out.printf("Amount to be paid in reais = %.2f%n", reais);
    }
}
