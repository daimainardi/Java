package curso.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime2 {
    public static void main(String[] args) {
        //convertendo data-hora global para local
        Instant dia06 = Instant.parse("2023-03-30T01:30:26z");

        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("dia 06 = " + form1.format(dia06));

        LocalDate res1 = LocalDate.ofInstant(dia06,ZoneId.systemDefault());
        LocalDate res2 = LocalDate.ofInstant(dia06,ZoneId.of("Portugal"));
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        LocalDateTime res3 = LocalDateTime.ofInstant(dia06,ZoneId.systemDefault());
        System.out.println("res3 = " + res3);
        LocalDateTime res4 = LocalDateTime.ofInstant(dia06,ZoneId.of("Portugal"));
        System.out.println("res4 = " + res4);

        //obter dados de uma data-hora-local
        LocalDate dia04 = LocalDate.parse("2023-03-30");
        LocalDateTime dia05 = LocalDateTime.parse("2023-03-30T20:30:00");

        System.out.println("dia04 dia = " + dia04.getDayOfMonth());
        System.out.println("dia04 mes = " + dia04.getMonthValue());
        System.out.println("dia04 ano = " + dia04.getYear());
        System.out.println("dia05 hora = " + dia05.getHour());
        System.out.println("dia05 minutos = " + dia05.getMinute());
    }
}
