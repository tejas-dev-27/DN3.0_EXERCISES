public class Main {
    public static void main(String[] args) {

        Order[] orders = {
                new Order("101", "Alice", 250.75),
                new Order("102", "Bob", 150.50),
                new Order("103", "Charlie", 300.00),
                new Order("104", "David", 200.25),
                new Order("105", "Eve", 175.00)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);

        Order[] bubbleSortedOrders = orders.clone();
        SortingAlgo.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders after Bubble Sort:");
        displayOrders(bubbleSortedOrders);

        Order[] quickSortedOrders = orders.clone();
        SortingAlgo.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        displayOrders(quickSortedOrders);
    }

    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
