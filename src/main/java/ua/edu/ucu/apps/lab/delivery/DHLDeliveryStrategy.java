package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.items.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(Item item) {
        System.out.println("Deliver by DHL: " + item.toString());
    }
}
