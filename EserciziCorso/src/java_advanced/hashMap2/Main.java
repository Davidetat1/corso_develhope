package java_advanced.hashMap2;

import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "C");
        hashMap.put(3, "Z");
        hashMap.put(4, "B");
        hashMap.put(5, "S");
        System.out.println(hashMap.values());
        System.out.println();

        Collection<String> values = hashMap.values();
        List<String> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        for (String value : sortedValues) {
            System.out.println(value);
        }
    }
}
