public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println();
        System.out.println("Paid rupees " + amount + " using PayPal: " + email);
    }
}