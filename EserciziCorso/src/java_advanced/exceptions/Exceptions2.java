
//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.

package java_advanced.exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        char character = '3';
        try {
            if (isDigit(character)) {
                System.out.println(character + " è un numero.");
            } else {
                throw new IllegalArgumentException(character + " non è un numero");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isDigit(char character) {
        return Character.isDigit(character);
    }
}