package com.lisovolik.service;

import com.lisovolik.model.Customer;
import com.lisovolik.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandr Lisovolik on  03.06.2020
 */

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer getById(Long id) {
        log.info("Customer getOne() ", id);
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("Customer save() ", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("Customer delete() ", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("Customer getAll() ");
        return customerRepository.findAll();
    }
}
