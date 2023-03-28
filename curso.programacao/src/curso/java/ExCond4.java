package curso.java;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExCond4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int duracao;
        //LocalDateTime inicio = LocalDateTime.of(2023,3,30,10,0);
        //LocalDateTime fim = LocalDateTime.of(2023,3,31,22,0);
        if (horaInicio<horaFim){
          duracao = horaFim - horaInicio;
        }
        else{
            duracao = 24 - horaInicio + horaFim;
        }
        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
        sc.close();
    }
}
