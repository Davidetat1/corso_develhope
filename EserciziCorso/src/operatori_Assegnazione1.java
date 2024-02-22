public class operatori_Assegnazione1 {
    public static void main (String arg[]){
        int a = 10;
        int b = 20;
          System.out.println(resultOfOperation(a,b));
    }

 public static int resultOfOperation (int a, int b){
     a += 5;
     b += 10;
     int mult = a * b;
     return mult;
  }
}