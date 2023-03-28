package curso.java;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime3 {
    public static void main(String[] args) {
        //calculos com data-hora
        LocalDate dia04 = LocalDate.parse("2023-03-30");
        LocalDateTime dia05 = LocalDateTime.parse("2023-03-30T20:30:00");
        Instant dia06 = Instant.parse("2023-03-30T01:30:26z");

        LocalDate semanaAnterior = dia04.minusDays(7);
        LocalDate semanaPosterior = dia04.plusDays(7);

        LocalDateTime semanaAnterior2 = dia05.minusDays(7);
        LocalDateTime semanaPosterior2 = dia05.plusDays(7);

        System.out.println("7 dias antes: " + semanaAnterior);
        System.out.println("7 dias depois: " + semanaPosterior);
        System.out.println("7 dias antes: " + semanaAnterior2);
        System.out.println("7 dias depois: " + semanaPosterior2);

        Instant semanaAnterior3 = dia06.minus(7, ChronoUnit.DAYS);
        Instant semanaPosterior3 = dia06.plus(7, ChronoUnit.DAYS);
        System.out.println("7 dias antes: " + semanaAnterior3);
        System.out.println("7 dias depois: " + semanaPosterior3);

        // duração de tempo
        Duration t1 = Duration.between(semanaAnterior.atTime(0,0), dia04.atTime(0,0));
        //Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), dia04.atStartOfDay());
        System.out.println("t1 dias = " + t1.toDays());

        Duration t2 = Duration.between(semanaAnterior2, dia05);
        System.out.println("t2 dias = " + t2.toDays());

        Duration t3 = Duration.between(semanaAnterior3, dia06);
        Duration t4 = Duration.between(dia06, semanaAnterior3);
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
