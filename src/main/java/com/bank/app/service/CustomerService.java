package com.bank.app.service;

import com.bank.app.model.Customer;

import java.util.List;

public interface CustomerService {
    void createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long customerId);
    Customer updateCustomer(Customer customer, Long customerId);
    String deleteCustomer(Long customerId);
}
