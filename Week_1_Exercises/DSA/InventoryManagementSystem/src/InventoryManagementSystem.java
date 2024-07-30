import java.util.HashMap;

public class InventoryManagementSystem {
    private final HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println();
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println();
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void printAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("Oops! we are running out of products");
        }
        else{
            for(Product product : inventory.values()){
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Quantity: " + product.getQuantity());
                System.out.println("Price: " + product.getPrice());
                System.out.println();
            }
        }
    }
}
