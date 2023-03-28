package curso.java;

import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);
        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);
        char w;
        w = sc.next().charAt(0);
        System.out.println("Você digitou: " + w);
        String s1, s2, s3;
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
