package ua.edu.ucu.apps.lab.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Pay by Credit Card: " + price;
    }

}
