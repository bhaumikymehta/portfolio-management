package com.practice.finance.PortfolioManagement.controller;

import com.practice.finance.PortfolioManagement.model.Customer;
import com.practice.finance.PortfolioManagement.service.impl.CustomerServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/portfolio")
@AllArgsConstructor(onConstructor_ = @Autowired)
public class CustomerController {

    private final CustomerServiceImpl service;

    @PostMapping(value = "/customer")
    public ResponseEntity<Customer> getCustomer(@RequestBody @NonNull Customer customer){
        log.info("Inside the customer controller");
        log.info("Customer firstname : {}",customer.getFirstName());
        return new ResponseEntity<>(service.getCustomerByFirstName(customer.getFirstName()), HttpStatus.OK);
    }


}
