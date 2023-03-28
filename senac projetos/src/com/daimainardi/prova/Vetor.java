package com.daimainardi.prova;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		System.out.println("Número de valores que serão armazenados:");
		Scanner sc = new Scanner(System.in);
		int tamanhoVetor = sc.nextInt();
		int[] vetor = new int[tamanhoVetor];
		for(int i = 0; i< vetor.length; i++) {
			System.out.println("Digite o número da posição " + i);
			vetor[i] = sc.nextInt();
		}
		System.out.println("A soma dos números pares é: " + somaPares(vetor));
		sc.close();
	}

	static int somaPares(int vet[]) {
		int soma = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
			}
		}
		return soma;
	}
}
