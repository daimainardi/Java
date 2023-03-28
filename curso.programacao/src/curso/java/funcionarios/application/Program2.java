package curso.java.funcionarios.application;

import curso.java.funcionarios.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("quantos funcionários deseja registrar? ");
        int n = sc.nextInt();

        List<Funcionario> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            lista.add(funcionario);
        }

        System.out.println();
        System.out.print("qual o id do funcionário que receberá aumento? ");
        Integer idFuncionario = sc.nextInt();
        System.out.print("quanto % de aumento? ");
        Double aumento = sc.nextDouble();
        System.out.println();

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
                idEncontrado++;
            }
        }
        if (idEncontrado == 0) {
            System.out.println("Este id não foi encontrado!");
        } else {
            System.out.println("Lista completa atualizada:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
        sc.close();
    }

}

