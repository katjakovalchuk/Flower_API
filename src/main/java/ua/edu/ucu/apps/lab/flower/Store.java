package ua.edu.ucu.apps.lab.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.filters.SearchFilter;
import ua.edu.ucu.apps.lab.items.Item;

@Getter
@Setter
public class Store {
    private List<Item> items;

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
