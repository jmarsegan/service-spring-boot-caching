package com.jerem.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleCustomerRepository implements CustomerRepository {

    @Override
    @Cacheable("customer")
    public Customer findByLastName(String lastName) {
        simulateSlowService();
        return new Customer("Toto", lastName);
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
