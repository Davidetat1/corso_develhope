package java_vol3.ereditarieta.es2;
public class Main {
    public static void main(String[] args){
        Forma forma = new Forma ();
        Rettangolo rettangolo = new Rettangolo(10,7);
        Triangolo triangolo = new Triangolo(8,4);
        forma.calcolaArea();
        System.out.println("Area Rettangolo = " + rettangolo.calcolaArea());
        System.out.println("Area Triangolo = " + triangolo.calcolaArea());
    }
}