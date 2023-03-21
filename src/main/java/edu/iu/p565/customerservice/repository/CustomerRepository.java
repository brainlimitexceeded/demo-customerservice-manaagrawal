package edu.iu.p565.customerservice.repository;

import java.util.ArrayList;

import edu.iu.p565.customerservice.model.Customer;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    public List<Customer> findAll() {
        return customers;
    }
    public int create(Customer customer) {
        int id = customers.size()+1;
        customer.setId(id);
        customers.add(customer);
        return id;
    }
}
