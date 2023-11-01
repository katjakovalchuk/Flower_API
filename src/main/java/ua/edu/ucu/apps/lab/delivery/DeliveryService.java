package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.items.Item;

public class DeliveryService implements Delivery {

    @Override
    public String deliver(Item items) {
        return "Deliver:" + items.toString();
    }

}
