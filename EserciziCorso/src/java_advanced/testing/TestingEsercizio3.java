/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
 */

package java_advanced.testing;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class TestingEsercizio3 {
    public static void main(String[] args) {
        TestingEsercizio3 tester = new TestingEsercizio3();

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("data originale: " + data);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String dataString = tester.formatterDate(data, formatter);
        System.out.println("data formattata " + dataString);

    }

    String formatterDate(OffsetDateTime data, DateTimeFormatter formatter) {
        return data.format(formatter);
    }

}

