package ua.edu.ucu.apps.lab7.payment;

public class PaymentService implements Payment {

    @Override
    public void pay(double price) {
        System.out.println("Pay:" + price);
    }
}
