package curso.java.conta.bancaria.heranca.application;

import curso.java.conta.bancaria.heranca.entities.Conta;
import curso.java.conta.bancaria.heranca.entities.ContaComercial;
import curso.java.conta.bancaria.heranca.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        //Conta conta = new Conta(1001, "Alex", 1000.00);
        //ContaComercial contaComercial = new ContaComercial(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        //Conta conta1 = contaComercial;
        //Conta conta2 = new ContaComercial(1003,"Bob", 0.0, 200.0);
        //Conta conta3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        //ContaComercial conta4 = (ContaComercial) conta2;
        //conta4.emprestimo(100.00);

        //ContaComercial conta5 = (ContaComercial) conta3;
        /*if (conta3 instanceof ContaComercial) {
            ContaComercial conta5 = (ContaComercial) conta3;
            conta5.emprestimo(200.00);
            System.out.println("Realizei emprestimo");
        }

        if (conta3 instanceof ContaPoupanca){
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.saldoAtualizado(0.05);
            System.out.println("Atualização! ");
        }*/

        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaComercial(1003, "Bob", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());

        Conta x = new Conta(1020, "Alex", 1000.0);
        Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
        x.saque(50.0);
        y.saque(50.0);
        System.out.printf("saldo conta x: %.2f%n", x.getSaldo());
        System.out.printf("saldo conta y: %.2f%n", y.getSaldo());



    }
}
