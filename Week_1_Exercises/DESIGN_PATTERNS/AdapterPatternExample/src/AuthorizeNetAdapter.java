public class AuthorizeNetAdapter implements PaymentProcessor {
    private final AuthorizeNet authorizeNet;

    public AuthorizeNetAdapter(AuthorizeNet authorizeNet) {
        this.authorizeNet = authorizeNet;
    }

    @Override
    public void processPayment(double amount) {
        authorizeNet.makePayment(amount);
    }
}
