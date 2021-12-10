package com.greatlearning.service;

import com.greatlearning.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer updateCustomer(int customerId);

    public void deleteCustomer(int customerId);
}
