package com.practice.finance.PortfolioManagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="career")
    private String career;

}
