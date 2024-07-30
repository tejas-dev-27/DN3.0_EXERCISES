public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println();
        System.out.printf("Mobile App: Stock price updated to rupees %.2f\n", stockPrice);
    }
}
