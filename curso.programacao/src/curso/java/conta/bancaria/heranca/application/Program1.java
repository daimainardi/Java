package curso.java.conta.bancaria.heranca.application;

import curso.java.conta.bancaria.heranca.entities.Conta;
import curso.java.conta.bancaria.heranca.entities.ContaComercial;
import curso.java.conta.bancaria.heranca.entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Conta> contaList = new ArrayList<>();
        contaList.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
        contaList.add(new ContaComercial(1002, "Maria", 1000.0, 400.0));
        contaList.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
        contaList.add(new ContaComercial(1005, "Anna", 500.0, 500.0));

        double soma = 0.0;
        for (int i = 0; i < contaList.size();i++){
            soma += contaList.get(i).getSaldo();
        }
        System.out.printf("Total de saldo: %.2f", soma);
        System.out.println();

        for (int i = 0; i < contaList.size();i++){
            contaList.get(i).deposito(10.00);
            System.out.printf("Saldo atualizado da conta %d: %.2f%n",
                    contaList.get(i).getNumero() ,contaList.get(i).getSaldo());
        }


    }
}
