/*Scrivere un programma che contenga un metodo che
 permette di inizializzare una matrice riempita con dei valori a vostro piacimento e
 restituisca la somma degli elementi sulla prima riga
 */

public class array_2D1 {

        public static void main(String args[]) {
            System.out.println(sommaPrimaRiga());
        }
        public static int sommaPrimaRiga (){
            int[][] matrice = {{1,2},{3,4}};
            int sum = 0;
            for (int i = 0; i == 0; i++){
                for (int j = 0; j < matrice[i].length; j++){
                    sum += matrice[i][j];
                }
            }
            return sum;
        }
    }
