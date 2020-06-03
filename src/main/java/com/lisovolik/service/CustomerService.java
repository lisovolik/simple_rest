package com.lisovolik.service;

import com.lisovolik.model.Customer;

import java.util.List;

/**
 * Created by Alexandr Lisovolik on  03.06.2020
 */

public interface CustomerService {
    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
