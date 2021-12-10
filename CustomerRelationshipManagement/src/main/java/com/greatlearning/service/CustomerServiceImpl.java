package com.greatlearning.service;

import com.greatlearning.dao.CustomerDAO;
import com.greatlearning.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer updateCustomer(int customer) {
        return customerDAO.updateCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customer) {
        customerDAO.deleteCustomer(customer);
    }
}
