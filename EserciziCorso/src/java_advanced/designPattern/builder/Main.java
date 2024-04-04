/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
 */

package java_advanced.designPattern.builder;


public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder("Luca", "Rossi");
        Person person1 = personBuilder
                .setAge(34)
                .setAddress("Via del capo")
                .build();
        System.out.println(person1);


        PersonBuilder personBuilder2 = new PersonBuilder("Paolo", "Verdi");
        Person person2 = personBuilder2.build();
        System.out.println(person2);







    }
}
