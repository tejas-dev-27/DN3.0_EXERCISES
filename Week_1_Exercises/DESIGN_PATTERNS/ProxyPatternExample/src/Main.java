public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("cognizant.jpg");

        System.out.println();
        System.out.println("First call to display:");
        image.display();

        System.out.println();
        System.out.println("\nSecond call to display:");
        image.display();
    }
}
