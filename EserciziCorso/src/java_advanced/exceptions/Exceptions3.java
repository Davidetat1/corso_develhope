/*
Scrivere una funzione che provi a dividere un numero per
 0 e catturi l'eccezione leggendone il
messaggio.
 */

package java_advanced.exceptions;

public class Exceptions3 {
    public static void main(String[] args) {
        try {
            divOfZero(3,0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void divOfZero(int dividendo, int divisore) {
        if (divisore == 0) {
            throw new ArithmeticException("Divisione per zero non consentita");
        }
        int risultato = dividendo / divisore;
        System.out.println("risultato " + risultato);
    }
}