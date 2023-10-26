package ua.edu.ucu.apps.lab.filters;

import ua.edu.ucu.apps.lab.items.Item;

public interface SearchFilter {
    boolean match(Item item);
}
