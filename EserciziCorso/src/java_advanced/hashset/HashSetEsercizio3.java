/*

Create la struttura, La popolate e poi implementate una ricerca nel set a partire da un valore di input,
se lo trovate allora lo togliete dal set. Fate in modo di trovare
tutti i valori con cui avete popolato il set in modo che rimanga vuoto.
A quel punto stampate il set per vedere che sia effettivamente vuoto.

*/


package java_advanced.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEsercizio3 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Davide");
        names.add("Marco");
        names.add("Luca");

        System.out.println("HashSet creato: " + names);

        String valoreInput1 = "Davide";          //1a ricerca nel set per trovare il valore di input ed eliminarlo.
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String valore = iterator.next();
            if (valore.equals(valoreInput1)) {
                iterator.remove();
                System.out.println("il valore \"" + valoreInput1 + "\" è stato rimosso dall'HashSet");
            }
        }

        System.out.println("HashSet dopo la ricerca e rimozione del valore: \"" + valoreInput1 + "\" " + names);

        String valoreInput2 = "Marco";   //2a ricerca nel set
        iterator = names.iterator();
        while (iterator.hasNext()) {
            String valore = iterator.next();
            if(valore.equals(valoreInput2)){
                iterator.remove();
                System.out.println("il valore \"" + valoreInput2 + "\" è stato rimosso dall'HashSet");
            }
        }

        System.out.println("HashSet dopo la ricerca e rimozione del valore: \"" + valoreInput2 + "\" " + names);

        String valoreInput3 = "Luca";     //3a ricerca nel set
        iterator = names.iterator();
        while(iterator.hasNext()){
            String valore = iterator.next();
            if(valore.equals(valoreInput3)){
                iterator.remove();
               System.out.println("il valore \"" + valoreInput3 + "\" è stato rimosso dall'HashSet");
            }
        }

        System.out.println("HashSet dopo la ricerca e rimozione degli elementi:" + names);
    }
}
