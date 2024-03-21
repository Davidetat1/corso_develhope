/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
*/

package java_advanced.arrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Studente("Davide", 25));
        listaStudenti.add(new Studente("Marco", 34));
        listaStudenti.add(new Studente("Luca", 22));

        System.out.println("Lista studenti: ");
        for( Studente studente : listaStudenti) {
            System.out.println("Studente: " + studente.getNome() + ", età: " + studente.getEta());
        }
        listaStudenti.add(new Studente("Veronica", 22));
        listaStudenti.add(new Studente("Alessia", 23));
        listaStudenti.add(new Studente("Carlotta", 26));
        listaStudenti.add(new Studente("Serena", 27));
        System.out.println();

        System.out.println("lista Studenti aggiornata:");
        for(Studente studente: listaStudenti){
            System.out.println("Nome: " + studente.getNome() + ", Età: " + studente.getEta());
        }
    }
}
