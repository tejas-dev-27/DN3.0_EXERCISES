import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgo {
    public static int linearSearch(Product[] products, String targetProductName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(targetProductName)) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static int binarySearch(Product[] products, String targetProductName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName)); // Ensure the array is sorted

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(targetProductName);

            if (comparison == 0) {
                return mid; // Element found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
