/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
 */

package java_advanced.date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateEsercizio4 {
    public static void main(String[] args) {

        OffsetDateTime dateInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("data iniziale: " + dateInput);

        OffsetDateTime otherDate = dateInput.plusYears(1).plusDays(7).minusMonths(1);
        String stringDate = otherDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALIAN));
        System.out.println("data aggiornata " + stringDate);


    }
}
