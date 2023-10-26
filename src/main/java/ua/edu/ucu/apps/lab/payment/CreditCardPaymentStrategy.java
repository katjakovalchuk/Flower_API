package ua.edu.ucu.apps.lab.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Pay by Credit Card: " + price);
    }


}
