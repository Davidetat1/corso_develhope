/*Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice
specifico all'interno di una stringa e lo stampi.
Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire
il carattere in unicode o una stringa di errore.
Per la creazione della stringa di risultato dovrebbe essere
utilizzato StringBuilder.
 */

package java_vol3.metodi_stringhe.es2;

public class String_build2 {
    public static void main (String[] args){
UnicodeChar unicodeChar = new UnicodeChar("oggi è venerdi", 2);
        System.out.println(unicodeChar.findUnicodeChar());

    }
}
