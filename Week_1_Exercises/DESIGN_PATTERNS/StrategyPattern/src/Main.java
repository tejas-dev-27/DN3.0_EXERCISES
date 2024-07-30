public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("123x-xxxx-xxxx-x321");
        paymentContext.setPaymentStrategy(creditCard);
        paymentContext.executePayment(50.00);

        PaymentStrategy payPal = new PayPalPayment("user@payment.com");
        paymentContext.setPaymentStrategy(payPal);
        paymentContext.executePayment(500.00);
    }
}
