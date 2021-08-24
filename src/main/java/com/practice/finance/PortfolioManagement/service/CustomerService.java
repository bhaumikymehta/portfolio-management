package com.practice.finance.PortfolioManagement.service;

import com.practice.finance.PortfolioManagement.model.Customer;

public interface CustomerService {
    public Customer getCustomerByFirstName(String firstName);
}
