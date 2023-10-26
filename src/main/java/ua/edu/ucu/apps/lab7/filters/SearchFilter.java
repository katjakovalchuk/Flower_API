package ua.edu.ucu.apps.lab7.filters;

import ua.edu.ucu.apps.lab7.items.Item;

public interface SearchFilter {
    boolean match(Item item);
}
