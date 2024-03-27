/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */

package java_advanced.date;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class DateEsercizio3 {

    public static void main(String[] args) {

        OffsetDateTime dateInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data Originale: "+ dateInput);
        System.out.println();

        int year = dateInput.getYear();
        System.out.println("Anno: " + year);

        int month = dateInput.getMonthValue();
        System.out.println("mese: " + month);

        int dayOfMonth = dateInput.getDayOfMonth();
        System.out.println("giorno del mese: " + dayOfMonth);

        DayOfWeek dayOfWeek = dateInput.getDayOfWeek();
        System.out.println("giorno della settimana: " + dayOfWeek);

        //Altro possibile approccio senza l'utilizzo dei metodi.

        System.out.println();
        DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
        String dataString = dateInput.format(yearFormatter);
        System.out.println("Anno: " + dataString);

        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM");
        String monthString = dateInput.format(monthFormatter);
        System.out.println("Mese: " + monthString);

        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
        String dayString = dateInput.format(dayFormatter);
        System.out.println("Giorno del mese: " + dayString);

        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE");
        String dayOfWeekString = dateInput.format(dayOfWeekFormatter);
        System.out.println("Giorno della settimana: " + dayOfWeekString);

    }
}
