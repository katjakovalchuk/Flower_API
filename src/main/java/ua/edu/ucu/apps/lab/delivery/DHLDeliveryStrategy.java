package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.items.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(Item item) {
        return "Deliver by DHL: " + item.toString();
    }
}
