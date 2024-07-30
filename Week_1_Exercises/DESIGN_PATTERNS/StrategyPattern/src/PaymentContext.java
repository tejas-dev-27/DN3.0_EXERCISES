public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy != null) {
            System.out.println();
            paymentStrategy.pay(amount);
        } else {
            System.out.println();
            System.out.println("Payment strategy not set!");
        }
    }
}