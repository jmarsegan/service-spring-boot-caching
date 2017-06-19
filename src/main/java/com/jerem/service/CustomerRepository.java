package com.jerem.service;

public interface CustomerRepository {

    Customer findByLastName(String lastName);
}
