/*Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero
 come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)*/
public class while1 {
    public static void main(String args[]) {
        int number = 7;
        System.out.println(sumNumbers(number));
    }

    public static int sumNumbers(int number) {
        int i = 1;
        int result = 0;
        while (i < number) {
            result += i;
            i++;
        }
        return result;
    }

}
