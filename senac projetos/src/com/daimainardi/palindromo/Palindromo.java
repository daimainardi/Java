package com.daimainardi.palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um texto: ");
		String texto = ler.nextLine();
		ler.close();
		String textoInvertido = inverter(texto);
		System.out.println(textoInvertido);

		boolean ehPalindromo = palindromo(texto);
		if (ehPalindromo) {
			System.out.println("É um palindromo!");
		} else {
			System.out.println("Não é um palindromo!");
		}
	}

	public static boolean palindromo(String texto) {
		String inverso = inverter(texto);
		return inverso.equalsIgnoreCase(texto);
	}

	public static String inverter(String texto) {
		String inverso = "";
		for (int i = texto.length() - 1; i >= 0; i--) {
			inverso += texto.charAt(i);
		}
		return inverso;
	}
}
