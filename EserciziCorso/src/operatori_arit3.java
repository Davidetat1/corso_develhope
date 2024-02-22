public class operatori_arit3 {
    public static void main(String args[]){
            int x = 10;
            int y = 5;
            int a = 15;
            System.out.println("la media tra " + x + " e " + y + " e " + a + " è = " + media(x,y,a));
        }
        public static double media  (int x , int y, int a){
            int sum = x + y + a;
            double media = (double)sum / 3;
            return media;
    }
}
