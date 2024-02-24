/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
*/
public class ciclo_For1 {
    public static void main(String args[]) {
        int number = 10;
        System.out.println("la tabellina del " + number);
        tabellina(number);

    }

    public static void tabellina(int number) {
        for (int i = 0; i <= 10; i++)
            System.out.println(i * number);
    }
}
