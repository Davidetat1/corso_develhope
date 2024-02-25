/*Scrivi un programma che contenga un metodo che crea un array e lo riempie
con dei caratteri. Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.
 */
public class array2 {
    public static void main(String args[]) {
        char[] caratteri = creaArrayDiCaratteri();
        stampaOccorrenzeDiA(caratteri);
    }
    public static char[] creaArrayDiCaratteri(){
        char[] arrayDiCaratteri = new char [] {'a', 'b', 'c', 'd', 'e'};
        return arrayDiCaratteri;
    }
    public static void stampaOccorrenzeDiA(char[] arrayDicaratteri) {
        boolean occorrenzaTrovata = false;
        for (char carattere : arrayDicaratteri) {
            if (carattere == 'a') {
                occorrenzaTrovata = true;
                System.out.println("Trovata occorrenza del carattere 'a'");
            }
        }
        if (!occorrenzaTrovata) {
            System.out.println("Nessuna occorrenza di 'a' trovata ");
        }
    }
}
