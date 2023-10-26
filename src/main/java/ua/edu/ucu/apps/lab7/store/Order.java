package ua.edu.ucu.apps.lab7.store;

import java.util.LinkedList;

import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.items.Item;
import ua.edu.ucu.apps.lab7.payment.Payment;

public class Order {
    public LinkedList<Item> items;
    public Payment payment;
    public Delivery delivery;

    public Order(LinkedList items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            totalPrice += items.get(i).price();
        }
        return totalPrice;
    }

    public void processOrder() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
