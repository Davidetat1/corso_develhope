package java_vol3.classi_astratte;

public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(5, 4);
        Rettangolo rettangolo = new Rettangolo(3, 10);
        triangolo.calcolaArea();
        rettangolo.calcolaArea();
    }
}
