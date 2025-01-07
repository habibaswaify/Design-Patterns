package structural_patterns.adapter;

public class OldPaymentSystem implements IOldPaymentSystem{
    @Override
    public void creditCardPayment(double amount) {
        System.out.println("Amount payed by credit card: $"+amount);
    }
}
