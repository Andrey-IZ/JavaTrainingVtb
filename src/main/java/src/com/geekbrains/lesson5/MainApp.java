package src.com.geekbrains.lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        String[] words = {
                "aa", "121jh2", "aczx", "ds87jkad",
                "aaa", "121hk2", "aczx", "d7sad",
                "a", "12'12", "ac", "ds6ad",
                "aaa", "121v2", "acfdfzx", "dsajhd"
        };
        System.out.println(findDistinctWords(words));

        AddressBook addressBook = new AddressBook();
        addressBook.add("Mickheev", "+798886633");
        addressBook.add("Ldjaif", "+6218946");
        addressBook.add("Paldsd", "+5134354");
        addressBook.add("Antonenko", "+798886633");
        addressBook.add("Antonenko", "+761626633");

        System.out.println(addressBook.get("Antonenko"));
    }

    private static Map<String, Integer> findDistinctWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word :words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }


}
