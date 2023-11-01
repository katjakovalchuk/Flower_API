package ua.edu.ucu.apps.lab.payment;

public class PayPalCreditStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Pay by Pay Pal: " + price;
    }
}
