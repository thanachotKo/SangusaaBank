package SE.project.SangusaaBank.service;

import SE.project.SangusaaBank.data.CustomerRepository;
import SE.project.SangusaaBank.model.Customer;
import SE.project.SangusaaBank.model.CustomerHelp;
import SE.project.SangusaaBank.model.Login;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public void createCustomer(Customer customer) {
        String hashPin = hash(customer.getPassword());
        customer.setPassword(hashPin);
        repository.save(customer);
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer findCustomer(String id) {
        try {
            return repository.findById(id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
    public Customer checkPin(Login login) {

        Customer storedCustomer = findCustomer(login.getId());

        if (storedCustomer != null) {
            String hashPin = storedCustomer.getPassword();

            if (BCrypt.checkpw(login.getPassword(), hashPin))
                return storedCustomer;
        }
        return null;
    }

    public Customer createSetCustomer(CustomerHelp customerHelp) {
        Customer customer = repository.findById(customerHelp.getId());
        customer.setPassword(customerHelp.getPassword());
        return customer;
    }

    public void storeCustomer(Customer customer) {
        /*String hashPin = hash(customer.getPassword());
        customer.setPassword(hashPin);*/
        repository.store(customer);
    }

    private String hash(String pin) {
        String salt = BCrypt.gensalt(10);
        return BCrypt.hashpw(pin, salt);
    }
}