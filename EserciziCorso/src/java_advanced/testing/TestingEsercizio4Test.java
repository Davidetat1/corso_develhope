package java_advanced.testing;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TestingEsercizio4Test {
    @Test
    public void testDateParsing() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023, data.getYear());
        assertEquals(3, data.getMonthValue());
        assertEquals(1, data.getDayOfMonth());
        String dayOfWeekString = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertTrue(dayOfWeekString.equalsIgnoreCase(dayOfWeekString));
    }
}

