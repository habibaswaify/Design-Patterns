package structural_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        // Create separate payment systems
        NewPaymentSystem newPaymentSystem = new NewPaymentSystem();
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();

        // Create a two-way adapter and pay by credit card (old) to the digital wallet (new)
        IOldPaymentSystem oldToNew = new PaymentAdapter(newPaymentSystem);
        oldToNew.creditCardPayment(60);

        // Create a two-way adapter and pay by the digital wallet (new) to the credit card (old)
        INewPaymentSystem newToOld = new PaymentAdapter(oldPaymentSystem);
        newToOld.digitalWalletPayment(100);
    }
}
