/*

Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato

*/

package java_advanced.hashset;

import java.util.HashSet;

public class HashSetEsercizio2 {
    public static void main(String[] args) {
        HashSet<String> squadre = riempiHashSet();
        System.out.println("HashSet Originale: " + squadre);

        HashSet<String> nuovoSet = creaHashSimile(squadre);
        System.out.println("Hash simile creato: " + nuovoSet);

        verificaElemento(squadre, "Bari");
    }

    public static HashSet<String> riempiHashSet(){
        HashSet<String> squadre = new HashSet<>();
        squadre.add("Bari");
        squadre.add("Juventus");
        squadre.add("Inter Miami");
        squadre.add("Barcellona");
        return squadre;
    }

    public static HashSet<String> creaHashSimile(HashSet<String> originalSet){
        HashSet<String> nuovoSet = new HashSet<>(originalSet);
        nuovoSet.add("Milan");
        nuovoSet.add("Roma");
        return nuovoSet;
    }

    public static void verificaElemento(HashSet<String> squadre, String elementoDaVerificare){
        boolean presente = squadre.contains(elementoDaVerificare);
        System.out.println("L'elemento \"" + elementoDaVerificare + "\" è presente nell'HashSet Originale? " + presente);
    }
}

