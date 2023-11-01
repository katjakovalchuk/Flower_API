package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.items.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(Item items) {
        return "Deliver by Post: " + items.toString();
    }
}
