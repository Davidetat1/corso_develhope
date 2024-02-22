public class operatori_arit2 {
 public static void main(String args[]) {
    int x = 30;
    int y = 2;
    int a = 5;
    System.out.println("la divisione tra " + x + " e " + y + " e " + a + " è = " + divOf(x,y,a));
}
 public static int divOf (int x , int y, int a){
    int div = x / y / a ;
    return div;
 }

}
