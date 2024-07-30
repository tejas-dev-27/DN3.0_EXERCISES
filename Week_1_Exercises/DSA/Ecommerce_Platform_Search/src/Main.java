public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Book", "Books"),
                new Product("4", "Shoes", "Fashion")
        };

        // Test linear search
        int linearSearchResult = SearchAlgo.linearSearch(products, "Smartphone");
        System.out.println();
        System.out.println("Linear Search Result: " + (linearSearchResult != -1 ? products[linearSearchResult].getProductName() : "Not Found"));

        // Test binary search
        int binarySearchResult = SearchAlgo.binarySearch(products, "Smartphone");
        System.out.println();
        System.out.println("Binary Search Result: " + (binarySearchResult != -1 ? products[binarySearchResult].getProductName() : "Not Found"));

        int linearSearchResult1 = SearchAlgo.linearSearch(products, "System");
        System.out.println();
        System.out.println("Linear Search Result: " + (linearSearchResult1 != -1 ? products[linearSearchResult1].getProductName() : "Not Found"));

        int binarySearchResult1 = SearchAlgo.binarySearch(products, "System");
        System.out.println();
        System.out.println("Binary Search Result: " + (binarySearchResult1 != -1 ? products[binarySearchResult1].getProductName() : "Not Found"));
    }
}
