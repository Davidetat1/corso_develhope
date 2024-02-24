/*Scrivi un programma che contenga un metodo che prende in ingresso un numero e
il massimo numero di risultati che vuoi avere e stampi tutti i numeri
 naturali in ordine inverso (quindi se passo il punto di partenza a 6 e gli
 dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
 */

public class ciclo_For2 {
    public static void main(String args[]) {
        int firstNumber = 10;
        int maxResult = 3;
        result(firstNumber, maxResult);
    }
    public static void result(int firstNumber, int maxResult){
        for ( int i = firstNumber; i > maxResult;  i--){
            System.out.println(i);
        }
    }
}
