/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
 */

package java_advanced.date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateEsercizio2 {
    public static void main(String[] args) {

        OffsetDateTime dateInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("data originale: " + dateInput);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        String dataString = dateInput.format(formatter);
        System.out.println("data formattata: " + dataString);
    }
}
