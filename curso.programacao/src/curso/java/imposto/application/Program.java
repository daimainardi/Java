package curso.java.imposto.application;

import curso.java.imposto.entities.Pessoa;
import curso.java.imposto.entities.PessoaFisica;
import curso.java.imposto.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Pessoa> pessoaList = new ArrayList<>();
        System.out.print("Digite o número de contribuintes que deseja cadastrar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Contribuinte #" + (i+1)+ ":");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char pessoa = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
            if (pessoa == 'f'){
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastosSaude);
                pessoaList.add(pessoaFisica);
            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
                pessoaList.add(pessoaJuridica);
            }
        }
        System.out.println("Impostos pagos:");
        for (int i = 0; i < pessoaList.size(); i++){
            System.out.print(pessoaList.get(i).toString());
        }
        Double somaImposto = 0.0;
        for (int i = 0; i < pessoaList.size(); i++){
            somaImposto += pessoaList.get(i).imposto();
        }
        System.out.printf("Total de impostos: $ %.2f%n", somaImposto);
    }
}
