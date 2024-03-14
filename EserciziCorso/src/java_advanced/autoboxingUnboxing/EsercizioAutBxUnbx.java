/*
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati
 */

package java_advanced.autoboxingUnboxing;

public class EsercizioAutBxUnbx {
    public static void main(String[] args) {

        //Autoboxing
        int intValue = 3;
        Integer integerValue = intValue;

        double doubleValue = 3.14;
        Double doubleObject = doubleValue;

        char charValue = 'D';
        Character charObject = charValue;

        //Unboxing
        Integer anotherInteger = 100;
        int unboxedInt = anotherInteger;

        Double anotherDouble = 3.50;
        double unboxedDouble = anotherDouble;

        Character anotherChar = 'X';
        char unboxedChar = anotherChar;

        sumInt(intValue, unboxedInt);
        stampaChar(unboxedChar);
        sumInteger(integerValue, anotherInteger);
        stampaCharacter(anotherChar);
    }

    public static void sumInt(int a, int b) {
        System.out.println("Somma di int: " + a + " + " + b + " = " + (a + b));
    }

    public static void stampaChar(char c) {
        System.out.println("Stampa di char: " + c);
    }

    public static void sumInteger(Integer a, Integer b) {
        System.out.println("Somma di Integer: " + a + " + " + b + " = " + (a + b));
    }

    public static void stampaCharacter(Character c) {
        System.out.println("Stampa di Character: " + c);
    }


}
