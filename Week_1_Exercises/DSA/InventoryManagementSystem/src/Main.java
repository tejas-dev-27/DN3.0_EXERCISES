public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("1", "Laptop", 10, 30000.10);
        Product product2 = new Product("2", "Smartphone", 20, 10000.54);
        ims.addProduct(product1);
        ims.addProduct(product2);

        Product product3 = new Product("3", "Gaming Laptop", 5, 80000.00);
        ims.updateProduct("3", product3);
        ims.addProduct(product3);

        Product retrievedProduct = ims.getProduct("1");
        Product retrievedProduct1 = ims.getProduct("2");
        Product retrievedProduct2 = ims.getProduct("3");
        System.out.println("Retrieved Product: " + retrievedProduct.getProductName());
        System.out.println("Retrieved Product: " + retrievedProduct1.getProductName());
        System.out.println("Retrieved Product: " + retrievedProduct2.getProductName());
        System.out.println();

        Product product4 = new Product("4", "RealMe", 1, 18000.99);
        ims.updateProduct("4", product4);

        ims.printAllProducts();

    }
}
