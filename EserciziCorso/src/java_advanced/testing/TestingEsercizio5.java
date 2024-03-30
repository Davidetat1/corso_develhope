package java_advanced.testing;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestingEsercizio5 {
    public static void main(String[] args) {


        OffsetDateTime dateInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("data iniziale: " + dateInput);

        OffsetDateTime otherDate = dateInput.plusYears(1).plusDays(7).minusMonths(1);
        String stringDate = otherDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALIAN));
        System.out.println("data aggiornata " + stringDate);
    }
}
