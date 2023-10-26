package ua.edu.ucu.apps.lab7.delivery;

import ua.edu.ucu.apps.lab7.items.Item;

public class DeliveryService implements Delivery {

    @Override
    public void deliver(Item items) {
        System.out.println("Deliver:" + items.toString());
    }

}
