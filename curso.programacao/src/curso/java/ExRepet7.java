package curso.java;

import java.util.Locale;
import java.util.Scanner;

public class ExRepet7 {
    public static void main(String[] args){
       Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nPares = sc.nextInt();
        for (int i = 0; i < nPares; i++){
            double primeiro = sc.nextInt();
            double segundo = sc.nextInt();
            if (segundo ==0){
                System.out.println("divisão impossível");
            } else {
                double divisao = primeiro / segundo;
                System.out.printf("%.1f%n", divisao);
            }
        }
        sc.close();
    }
}
