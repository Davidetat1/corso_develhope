/*Scrivere un programma che contenga una classe che definisce
un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.*/

package Java_Vol2.Getter_Setter_Es2;

public class Esercizio2_Getter_Setter {
    public static void main (String[] args){
        Auto auto1 = new Auto("Audi", "Q8", "FX23400", "2.967cc");
        System.out.println("Marca Auto: " + auto1.getmarca());
        System.out.println( "Modello: " + auto1.getModello());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println( "Cilindrata: " + auto1.getCilindrata());
    }
}
