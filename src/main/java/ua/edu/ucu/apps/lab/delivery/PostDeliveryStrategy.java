package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.items.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(Item items) {
        System.out.println("Deliver by Post: " + items.toString());
    }
}
