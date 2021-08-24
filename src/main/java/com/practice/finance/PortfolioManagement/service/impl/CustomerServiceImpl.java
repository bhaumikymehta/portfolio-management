package com.practice.finance.PortfolioManagement.service.impl;

import com.practice.finance.PortfolioManagement.model.Customer;
import com.practice.finance.PortfolioManagement.repository.CustomerRepository;
import com.practice.finance.PortfolioManagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer getCustomerByFirstName(String firstName) {
        List<Customer> customerList = customerRepository.findAllByFirstName(firstName);

        Customer customer =customerList.get(0);
        log.info("Customer object from database:{}", customerList.get(0));
        log.info(customer.toString());
        return customer;
    }
}
