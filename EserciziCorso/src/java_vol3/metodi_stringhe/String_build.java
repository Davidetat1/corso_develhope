/*
Scrivi un programma Java che abbia un metodo che prenda due
stringhe e le compari lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le
due stringhe sono differenti" basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

 */
package java_vol3.metodi_stringhe;

public class String_build {
    public static void main(String[] args) {

        String frase1 = "Venerdì";
        String frase2 = "Sabato";

        String result = compareString(frase1, frase2);
        System.out.println(result);
    }

    public static String compareString(String frase1, String frase2) {
        StringBuilder sb = new StringBuilder(); 
        if (frase1.equals(frase2)){
          sb.append("le stringhe sono uguali");
        }else {
           sb.append("le stringhe sono diverse");
        }
        return sb.toString();
    }
}
