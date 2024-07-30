import java.util.List;

public interface CustomerRepository {
    String findCustomerById(int id);
    List<String> findAllCustomers();
}