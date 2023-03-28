package curso.java;

public class ExercicioFor {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        // int n[] = new int [6]
        int[] n = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N é " + n.length);
        //System.out.print(n[i] + " ");
        for (int i = 0; i <= n.length - 1; i++)
			System.out.println("Na posição " + i + " temos o valor " + n[i]);

    }
}
