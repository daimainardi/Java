package curso.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate dia01 = LocalDate.now();
        LocalDateTime dia02 = LocalDateTime.now();
        Instant dia03 = Instant.now();

        LocalDate dia04 = LocalDate.parse("2023-03-30");
        LocalDateTime dia05 = LocalDateTime.parse("2023-03-30T20:00:00");
        Instant dia06 = Instant.parse("2023-03-30T01:30:26z");

        LocalDate dia07 = LocalDate.parse("01/03/2023", form1);
        LocalDateTime dia08 = LocalDateTime.parse("30/03/2023 01:30", form2);

        LocalDate dia09 = LocalDate.of(2023, 3, 30);
        LocalDateTime dia10 = LocalDateTime.of(2023,3, 30, 18,15);

        System.out.println("dia 01 = " + dia01);
        System.out.println("dia 02 = " + dia02);
        System.out.println("dia 03 = " + dia03);
        System.out.println("dia 04 = " + dia04);
        System.out.println("dia 05 = " + dia05);
        System.out.println("dia 06 = " + dia06);
        System.out.println("dia 07 = " + dia07);
        System.out.println("dia 08 = " + dia08);
        System.out.println("dia 09 = " + dia09);
        System.out.println("dia 10 = " + dia10);

        // transformando data-hora em string;

        LocalDate dia11 = LocalDate.parse("2023-03-30");
        LocalDateTime dia12 = LocalDateTime.parse("2023-03-30T20:00:00");
        Instant dia13 = Instant.parse("2023-03-30T01:30:26z");

        DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dia 11 = " + dia11.format(form3));
        System.out.println("dia 11 = " + form3.format(dia11));
        System.out.println("dia 11 = " + dia11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter form4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("dia 12 = " + dia12.format(form4));
        DateTimeFormatter form5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("dia 13 = " + form5.format(dia13));

        DateTimeFormatter form6 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("dia 12 = " + dia12.format(form6));

        DateTimeFormatter form7 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("dia 13 = " + form7.format(dia13));
    }
}
