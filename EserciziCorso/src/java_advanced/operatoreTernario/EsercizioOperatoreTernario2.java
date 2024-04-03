package java_advanced.operatoreTernario;

public class EsercizioOperatoreTernario2 {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una stringa"));
    }

    private static String checkString(String value) {
        String result = value.length() >= 10 ? "Lunghezza maggiore o uguale a 10" : "Lunghezza minore di 10";
        return result;
    }
}

