package curso.java.conta.bancaria.application;

import curso.java.conta.bancaria.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char answer = sc.next().charAt(0);
        Account account;
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(number, holder, balance);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Updated account data:");
        System.out.println(account);
        sc.close();
    }
}
