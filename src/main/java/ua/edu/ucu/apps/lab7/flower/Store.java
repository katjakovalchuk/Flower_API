package ua.edu.ucu.apps.lab7.flower;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.lab7.filters.SearchFilter;
import ua.edu.ucu.apps.lab7.items.Item;

public class Store {
    public List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
