/*
Scrivere una funzione che accetti un array in
input e provi a dividere un numero dell'array per 0 e gestisca sia l'eccezione della
divisione che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.
*/

package java_advanced.exceptions;

public class Exceptions4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 8};

        try {
            div(array, 3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void div(int[] array, int index) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        try {
            int risultato = array[index] / 0;
            System.out.println("risultato: " + risultato);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("impossibile eseguire la Divisione per zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Indice non presente nell'array");
        }
    }
}
