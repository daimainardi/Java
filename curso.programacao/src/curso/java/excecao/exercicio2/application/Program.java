package curso.java.excecao.exercicio2.application;

import curso.java.excecao.exercicio2.model.entities.Account;
import curso.java.excecao.exercicio2.model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double whithdrawLimit = sc.nextDouble();
        System.out.println();

        Account account = new Account(number, holder, balance, whithdrawLimit);
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());

        } catch (DomainException domainException) {
            System.out.println("Withdraw error: " + domainException.getMessage());
        }

    }
}
