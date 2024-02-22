public class operatori_Comparazione {
    public static void main (String args[]){
        int firstNumber = 50;
        int secondNumber = 30;
        System.out.println("first number = " + firstNumber);
        System.out.println("second number = " + secondNumber);

        boolean different = firstNumber != secondNumber ;
                System.out.println("the numbers are different = " + different);
    }
   public static boolean areDifferent (int firstNumber, int secondNumber){
    return firstNumber != secondNumber;
   }

}
