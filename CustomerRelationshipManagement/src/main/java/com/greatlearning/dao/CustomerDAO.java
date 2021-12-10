package com.greatlearning.dao;

import com.greatlearning.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer updateCustomer(int customerId);

    public void deleteCustomer(int customerId);
}
