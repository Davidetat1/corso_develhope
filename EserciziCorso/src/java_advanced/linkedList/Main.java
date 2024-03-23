/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata

 */
package java_advanced.linkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Pera"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Fragola"));
        fruitList.add(new Fruit("Arancia"));

        System.out.println("Lista Frutti: ");

        for(Fruit fruit: fruitList){
            System.out.println("- " + fruit.getName());
        }

        System.out.println();

        System.out.println("Lista Frutti Aggiornata: ");
        fruitList.addFirst(new Fruit("Pesca"));
        fruitList.addLast(new Fruit("Melone"));
        for(Fruit fruit: fruitList){
            System.out.println("- " + fruit.getName());
        }
    }
}
