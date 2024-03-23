package java_advanced.hashMap;


import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> firstMap = new HashMap<>();
        firstMap.put("MI", "Milano");
        firstMap.put("TO", "Torino");
        firstMap.put("BA", "Bari");

        System.out.println("first List");
        for (String i : firstMap.keySet()) {
            System.out.println("Provincia: " + i + " Citta: " + firstMap.get(i));
        }
        System.out.println();

        HashMap<String, String> secondMap = new HashMap<>(Map.of(
                "MI", "Milano",
                "TO", "Torino",
                "BA", "Bari"
        ));
        System.out.println("Second List: ");
        for (String i : secondMap.keySet()) {
            System.out.println("Provincia: " + i + " Citta: " + secondMap.get(i));
        }
        System.out.println();

        HashMap<String, String> thirdMap = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("MI", "Milano"),
                new AbstractMap.SimpleEntry<>("TO", "Torino"),
                new AbstractMap.SimpleEntry<>("BA", "Bari")
        ));

        System.out.println("Third List: ");
        for (String i : thirdMap.keySet()) {
            System.out.println("Provincia: " + i + " Citta: " + thirdMap.get(i));
        }
    }
}
