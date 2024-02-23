public class operatori_logici2 {
    public static void main (String args[]){
        int numero = 7;
        System.out.println("il numero " + numero + " è pari? = " + èPari(numero));
    }
    public static boolean èPari(int numero){
        return numero % 2  == 0;
    }
}