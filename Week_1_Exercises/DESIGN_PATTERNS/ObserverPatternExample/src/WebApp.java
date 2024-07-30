public class WebApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println();
        System.out.printf("Web App: Stock price updated to rupees %.2f\n", stockPrice);
    }
}
