package structural_patterns.adapter;

public class NewPaymentSystem implements INewPaymentSystem{

    @Override
    public void digitalWalletPayment(double amount) {
        System.out.println("Amount payed by digital wallet: $"+amount);
    }
}
