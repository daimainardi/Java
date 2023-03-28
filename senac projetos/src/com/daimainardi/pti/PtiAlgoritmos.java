package com.daimainardi.pti;

import java.util.Scanner;

public class PtiAlgoritmos {
	public static void main(String[] args) {
		int tamanhoVetor = input("Digite o número de elementos para o seu array: ");
		int numVetor[] = new int[tamanhoVetor];
		System.out.println("O tamanho do array escolhido é: " + numVetor.length);
		numVetor = populaVetor(numVetor);
		mostraElementosDoVetor(numVetor);
		verificaMaiorDiferenca(numVetor);
		boolean ordenado = estaOrdenado(numVetor);
		System.out.println("O array está ordenado: " + ordenado);
	}

	private static boolean estaOrdenado(int[] vetor) {
		for (int i = 1; i< vetor.length; i++) {
			if (vetor[i - 1] > vetor[i]) {
				return false;
			}
		}
		return true;
	}

	private static void verificaMaiorDiferenca(int[] vetor) {
		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		int diferenca = maior - menor;
		System.out.printf("O maior valor é %s, o menor valor é %s e a diferença entre eles é %s %n", maior, menor, diferenca);
	
	}

	private static void mostraElementosDoVetor(int[] vetor) {
		System.out.print("Exibindo elementos do array: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

	private static int[] populaVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input("Digite um número inteiro para a posição " + i + " do array: ");
		}
		return vetor;	
	}

	private static int input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		return resposta;
	}
}
