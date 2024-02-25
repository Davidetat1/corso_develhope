
/*Scrivere un programma che contenga un metodo che permetta
 di sostituire gli elementi duplicati in un array di interi con il valore -1.
 L'array ottenuto dovrà essere stampato a video.
*/

import java.util.Arrays;

public class array3 {
    public static void main(String args[]) {
        int[] numbers = {3, 3, 1, 1, 5, 5, 8, 8};
        rimuoviDuplicati(numbers);
        System.out.println("Array senza duplicati: " + Arrays.toString(numbers));
    }

    public static void rimuoviDuplicati(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                }
            }
        }
    }
}