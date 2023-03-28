package curso.java;

import java.util.Scanner;

public class ExRepet5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dentro = 0;
        int fora = 0;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (10 <= x && x <= 20){
                dentro ++;
            }
            else {
                fora ++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        sc.close();
    }
}
