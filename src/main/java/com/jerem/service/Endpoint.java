package com.jerem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Endpoint implements BSCarLoanSubscription {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private CustomerRepository repository;

    @Override
    public Boolean find(String name) {
        // fetch customer by last name
        Customer customer = repository.findByLastName(name);
        log.info(customer.toString());
        customer = repository.findByLastName(name);
        log.info(customer.toString());
        customer = repository.findByLastName(name);
        log.info(customer.toString());
        customer = repository.findByLastName(name);
        log.info(customer.toString());
        customer = repository.findByLastName(name);
        log.info(customer.toString());
        customer = repository.findByLastName(name);
        log.info(customer.toString());
        return true;
    }

}
