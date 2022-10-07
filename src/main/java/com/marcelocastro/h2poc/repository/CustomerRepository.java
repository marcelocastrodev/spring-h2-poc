package com.marcelocastro.h2poc.repository;

import com.marcelocastro.h2poc.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
