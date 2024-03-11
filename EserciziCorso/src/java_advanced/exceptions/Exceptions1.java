/*
Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
*/


package java_advanced.exceptions;

public class Exceptions1 {
    public static void main(String[] args){
        int min = 1;
        int max = 10;
        int num = 3;

        try {
            if (checkNumInRange(min, max, num)){
                System.out.println("il numero è nel range specificato");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Try catch executed");
        }
    }


    public static boolean checkNumInRange(int min, int max, int num) {
      if (num < min || num > max) {
          throw new IllegalArgumentException ("il numero non è nel range");
      }
        return true;
    }
}