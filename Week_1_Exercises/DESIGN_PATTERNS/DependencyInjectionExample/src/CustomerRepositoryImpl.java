
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private final Map<Integer, String> customers;

    public CustomerRepositoryImpl() {
        // Initialize some dummy customers
        customers = new HashMap<>();
        customers.put(1, "SURYA");
        customers.put(2, "TEJAS");
        customers.put(3, "TEJASWIN D");
        customers.put(4, "CHINNU");
        customers.put(5, "RAJAN");
    }

    @Override
    public String findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public List<String> findAllCustomers() {
        return new ArrayList<>(customers.values());
    }
}