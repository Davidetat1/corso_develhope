package java_advanced.testing;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class TestingEsercizio5Test {
    @Test
    public void dataTest(){
        OffsetDateTime dateInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime otherDate = dateInput.plusYears(1).plusDays(7).minusMonths(1);

        String formattedDate = otherDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));

        assertEquals("08 febbraio 2024", formattedDate);
    }
}

