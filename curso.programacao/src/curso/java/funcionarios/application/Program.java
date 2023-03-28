package curso.java.funcionarios.application;

import curso.java.funcionarios.entities.Funcionario;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = List.of(
                new Funcionario(1, "João", 3000D),
                new Funcionario(2, "Maria", 4000D),
                new Funcionario(3, "Pedro", 5000D),
                new Funcionario(4, "Daniel", 15000D),
                new Funcionario(5, "Daiane", 10000D));

        System.out.print("qual o id do funcionário que receberá aumento? ");
        Integer idFuncionario = sc.nextInt();
        System.out.print("quanto % de aumento? ");
        Double aumento = sc.nextDouble();

        for (int i = 0; i < lista.size(); i++) {
            if (idFuncionario == lista.get(i).getId()) {
                lista.get(i).novoSalario(aumento);
                System.out.print("Dados do funcionário atualizado: ");
                System.out.println(lista.get(i));
            }

        }
        int idEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (idFuncionario == lista.get(i).getId()) {
               idEncontrado ++;
            }
        }
        if (idEncontrado == 0){
            System.out.println("Este id não foi encontrado!");
        } else {
            System.out.println("Lista completa atualizada:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }

    }
}
