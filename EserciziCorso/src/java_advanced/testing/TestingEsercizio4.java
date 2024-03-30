package java_advanced.testing;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TestingEsercizio4 {
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
        String dayOfWeekString = dateInput.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("giorno della settimana: " + dayOfWeekString);
    }
}
