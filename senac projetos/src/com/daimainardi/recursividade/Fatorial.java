package com.daimainardi.recursividade;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println("Recursão linear");
		int x = fatorial(5);
		System.out.println(x);
	}

	public static int fatorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fatorial(n - 1);

	}

}
