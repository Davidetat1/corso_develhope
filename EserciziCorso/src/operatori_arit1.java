public class operatori_arit1 {
    public static void main(String args[]) {
        int x = 30;
        int y = 2;
        System.out.println("la divisione tra " + x + " e " + y + " è = " + divOf(x,y) + ", il resto è =" + resto (x,y));
    }
    public static int divOf (int x , int y){
        int div = x / y;
        return div;
    }
    public static int resto (int x , int y){
        int resto = x % y;
        return resto;
    }
}