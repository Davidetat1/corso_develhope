/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa
tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
 */

public class cicli_Avanzati1 {
    public static void main(String args[]) {
        int number = 10;
        result(number);
    }

    public static void result(int number) {
        for (int i = 0; i < number; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }
    }
}

