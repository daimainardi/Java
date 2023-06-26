package curso.java.fatura.application;

import curso.java.fatura.entity.Contract;
import curso.java.fatura.entity.Installment;
import curso.java.fatura.service.ContractService;
import curso.java.fatura.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract details:");
        Integer number = Integer.valueOf(input("Number: "));
        LocalDate date = LocalDate.parse(input("Date (dd/MM/yyyy): "), fmt);
        Double totalValue = Double.valueOf(input("Contract value: "));
        Integer months = Integer.valueOf(input("Enter the number of installments: "));

        Contract contract = new Contract(number,date,totalValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract,months);

        System.out.println("Installments:");
        for (Installment installment: contract.getInstallments()) {
            System.out.println(installment);
        }

    }
    private static String input(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
