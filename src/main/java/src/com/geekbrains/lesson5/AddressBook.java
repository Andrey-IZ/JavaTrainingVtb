package src.com.geekbrains.lesson5;

import java.util.*;

public class AddressBook {
    private final Map<String, Set<String>> records;

    public AddressBook() {
        this.records = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!records.containsKey(surname)) {
            records.put(surname, new TreeSet<>());
        }
        records.get(surname).add(phone);
    }

    public Collection<String> get(String surname) {
        return records.get(surname);
    }
}
