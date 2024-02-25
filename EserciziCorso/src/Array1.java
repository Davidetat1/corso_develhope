
/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e
che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */
public class Array1 {
    public static void main(String args[]) {
        int[] array = creaArray();
        int somma = calcolaSommaArray(array);
        System.out.println("La somma dei numeri nell'array è: " + somma);
    }

    public static int [] creaArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void stampa(int[] array){
    System.out.print("Contenuto dell'array: ");
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
        System.out.println();
}

    public static int calcolaSommaArray(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    return sum;
   }
}