package structural_patterns.adapter;
// Two-way adapter class.
public class PaymentAdapter implements INewPaymentSystem,IOldPaymentSystem{
    private NewPaymentSystem newPaymentSystem;
    private OldPaymentSystem oldPaymentSystem;
    public PaymentAdapter(NewPaymentSystem newPaymentSystem){
        this.newPaymentSystem = newPaymentSystem;
    }
    public PaymentAdapter(OldPaymentSystem oldPaymentSystem){
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void digitalWalletPayment(double amount) {
        oldPaymentSystem.creditCardPayment(amount);
    }

    @Override
    public void creditCardPayment(double amount) {
        newPaymentSystem.digitalWalletPayment(amount);

    }
}
