package java_advanced.testing;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestingEsercizio2 {
    public static void main(String[] args) {

        OffsetDateTime data = parseDate();
        System.out.println("data input: " + data);

        System.out.println();
        String dateStringFull = formatInFull(data);
        System.out.println("data Full Formatter: " + dateStringFull);

        System.out.println();
        String dateStringLong = formatInLong(data);
        System.out.println("data Long Formatter: " + dateStringLong);

        System.out.println();
        String dateStringMedium = formatInMedium(data);
        System.out.println("data Medium Formatter: " + dateStringMedium);

        System.out.println();
        String dateStringShort = formatInShort(data);
        System.out.println("data short Formatter: " + dateStringShort);

    }

    static String formatInFull(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    static String formatInShort(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    static String formatInMedium(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    private static String formatInLong(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    static OffsetDateTime parseDate() {
        return OffsetDateTime.parse("2002-03-01T13:00:00Z");
    }
}

