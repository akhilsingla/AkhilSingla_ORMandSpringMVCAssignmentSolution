package com.greatlearning.dao;

import com.greatlearning.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Customer", Customer.class).list();
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        System.out.println(customer);
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer updateCustomer(int customerId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class, customerId);
    }

    @Override
    public void deleteCustomer(int customerId) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(Customer.class, customerId));
    }
}
