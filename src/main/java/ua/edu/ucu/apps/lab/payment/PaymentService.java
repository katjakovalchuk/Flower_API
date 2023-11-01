package ua.edu.ucu.apps.lab.payment;

public class PaymentService implements Payment {

    @Override
    public String pay(double price) {
        return "Pay:" + price;
    }
}
