/*

Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi

*/

package java_advanced.hashset;

import java.util.HashSet;

public class HashsetEsercizio1 {
    public static void main(String[] args) {

        int size = hashSetfunction().size();
        System.out.println("Grandezza degli elementi:" + size);

        System.out.println("Le squadre nell'HashSet sono:");

        for (String squadra : hashSetfunction()) {
            System.out.println(squadra);
        }
    }

    public static HashSet<String> hashSetfunction() {
        HashSet<String> squadre = new HashSet<>();

        squadre.add("Juventus");
        squadre.add("Milan");
        squadre.add("Bari");
        return squadre;
    }
}

/* seconda modalità di svolgimento:

 public static void main(String[] args) {
         hashSetfunction();
    }

public static void hashSetfunction() {
    HashSet<String> squadre = new HashSet<>();

    squadre.add("Juventus");
    squadre.add("Milan");
    squadre.add("Bari");


    System.out.println("grandezza dell'HashSet Squadre: " + squadre.size());

    System.out.println("Le squadre all'interno dell'HashSet sono: ");
    for(String squadra: squadre) {
        System.out.println(squadra);
    }

}
}*/