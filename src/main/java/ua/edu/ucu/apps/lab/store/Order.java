package ua.edu.ucu.apps.lab.store;

import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.delivery.Delivery;
import ua.edu.ucu.apps.lab.items.Item;
import ua.edu.ucu.apps.lab.payment.Payment;
import ua.edu.ucu.apps.lab.user.AppUser;

@Getter
@Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private LinkedList<AppUser> users;

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

    public void addUser(AppUser user) {
        users.add(user);
    }

    public void removeUser(AppUser user) {
        users.remove(user);
    }

    public void notifyUsers() {
    }

}
