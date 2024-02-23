public class operatori_Comparazione2 {
    public static void main (String args[]){
        char a = 'a';
        char b = 'a';
        System.out.println("first char = " + a);
        System.out.println("second char = " + b);

        boolean different = areDifferent(a,b);
        System.out.println("the character are the same = " + different);
    }
    public static boolean areDifferent (char a, char b){
        return a == b;

    }
}
