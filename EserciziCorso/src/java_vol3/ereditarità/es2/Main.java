package java_vol3.ereditarità.es2;
public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo(10,3);
        Forma forma = new Forma ();
        forma.calcolaArea();
        System.out.println("Area = " + rettangolo.calcolaArea());
    }
}