package java_advanced.testing;

import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

class TestingEsercizio2Test {

    @Test
    public void testParseDate() {
        OffsetDateTime expected = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        assertEquals(expected, TestingEsercizio2.parseDate());
    }

    @Test
    public void testFormatInFull() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "venerdì 1 marzo 2002";
        assertEquals(expected, TestingEsercizio2.formatInFull(date));
    }
    @Test
    public void testFormatInMedium() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "1 mar 2002";
        assertEquals(expected, TestingEsercizio2.formatInMedium(date));
    }
    @Test
    public void testFormatInShort() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "01/03/02";
        assertEquals(expected, TestingEsercizio2.formatInShort(date));
    }
}