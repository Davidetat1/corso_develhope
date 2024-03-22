package java_advanced.arrayList2;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Studente("Antonio", 24));
        listaStudenti.add(new Studente("Alessia", 20));
        listaStudenti.add(new Studente("Alessandra", 25));
        listaStudenti.add(new Studente("Davide", 24));
        listaStudenti.add(new Studente("Vittorio", 20));
        listaStudenti.add(new Studente("Ginevra", 25));
        listaStudenti.add(new Studente("Serena", 24));
        listaStudenti.add(new Studente("Domenico", 20));
        listaStudenti.add(new Studente("Biagio", 25));
        listaStudenti.add(new Studente("Zara", 24));
        listaStudenti.add(new Studente("Xavier", 20));
        listaStudenti.add(new Studente("Giuseppe", 25));

        System.out.println("Lista Studenti:");
        for(Studente studente: listaStudenti) {
            System.out.println("- " + studente.getNome() + ", " + "Età: " + studente.getEta());
        }

        System.out.println();
        System.out.println("Lista Studenti aggiornata:");
        Collections.sort(listaStudenti);
        for(Studente studente: listaStudenti){
            System.out.println("- " + studente.getNome() + ", " + "Età: " + studente.getEta());
        }
    }
}
