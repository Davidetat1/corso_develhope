package java_advanced.testing;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestingEsercizio3Test {

    @Test
    public void testFormatterDate() {
        TestingEsercizio3 testing = new TestingEsercizio3();

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        String expected = "01 marzo 2023";
        String actual = testing.formatterDate(data, formatter);

        assertEquals(expected, actual);
    }
}
