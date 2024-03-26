/*
Crea un oggetto OffsetDateTime da questa stringa "2002-03-01T13:00:00Z"
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */

package java_advanced.date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateEsercizio1 {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("data input: " + data);

        System.out.println();
        String dateStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("data Full Formatter: " + dateStringFull);

        System.out.println();
        String dateStringLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("data Long Formatter: " + dateStringLong);

        System.out.println();
        String dateStringMedium= data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("data Medium Formatter: " + dateStringMedium);

        System.out.println();
        String dateStringShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("data short Formatter: " + dateStringShort);

    }
}
