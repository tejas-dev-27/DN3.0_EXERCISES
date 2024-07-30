import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomer(int id) {
        return customerRepository.findCustomerById(id);
    }

    public List<String> getAllCustomers() {  // New method to get all customers
        return customerRepository.findAllCustomers();
    }
}