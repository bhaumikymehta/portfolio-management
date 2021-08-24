package com.practice.finance.PortfolioManagement.repository;

import com.practice.finance.PortfolioManagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public List<Customer> findAllByFirstName(String firstName);
}
