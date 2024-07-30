public class Main {
    public static void main(String[] args) {

        AuthorizeNet authorizeNet = new AuthorizeNet();
        Stripe stripe = new Stripe();

        PaymentProcessor authorizeNetProcessor = new AuthorizeNetAdapter(authorizeNet);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);

        authorizeNetProcessor.processPayment(50.00);
        stripeProcessor.processPayment(100.00);
    }
}
