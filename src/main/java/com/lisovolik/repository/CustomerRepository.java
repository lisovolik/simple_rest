package com.lisovolik.repository;

import com.lisovolik.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexandr Lisovolik on  03.06.2020
 */


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
