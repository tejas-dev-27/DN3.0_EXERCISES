public class Main {
    public static void main(String[] args) {
        // Get the instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both logger instances
        logger1.log("LOG 1");
        logger2.log("LOG 2");

        // Verify that both instances are the same
        if (logger1 == logger2) {
            System.out.println();
            System.out.println("Both LOG 1 and LOG 2 are the same instances.");
        } else {
            System.out.println();
            System.out.println("Both LOG 1 and LOG 2 are different instances.");
        }
    }
}