import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the concrete repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a single customer
        String customerDetails = customerService.getCustomer(3);
        System.out.println();
        System.out.println("Displaying Customer by ID: " + customerDetails);

        // Use the service to find all customers
        List<String> allCustomers = customerService.getAllCustomers();
        System.out.println();
        System.out.println("Displaying all Customers in Repository:");
        for (String customer : allCustomers) {
            System.out.println(customer);
        }
    }
}