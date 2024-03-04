/*Scrivere un programma che contenga una classe chiamata Animale ed
 un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
 Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso()
 per miagolare. Prova quindi a far stampare il verso di Animale e di Gatto.*/

package java_vol3.ereditarità.Es1;

public class Animale {
    public void faiIlVerso() {
        System.out.println("verso di animale di animale ignoto:");
    }

    public static void main(String[] args) {

        Animale animale = new Animale();
        Gatto gatto = new Gatto();
        Cane cane = new Cane();
        animale.faiIlVerso();
        gatto.faiIlVerso();
        cane.faiIlVerso();
    }
}
