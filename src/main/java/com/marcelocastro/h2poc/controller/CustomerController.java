package com.marcelocastro.h2poc.controller;

import com.google.common.collect.Lists;
import com.marcelocastro.h2poc.model.Customer;
import com.marcelocastro.h2poc.repository.CustomerRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
@Slf4j
public class CustomerController {

  private final CustomerRepository customerRepository;

  @PostMapping
  public void postCustomer(@RequestBody Customer customer) {
    log.info("Post request for customer {}", customer);
    customerRepository.save(customer);
  }

  @GetMapping
  public List<Customer> getAllCustomers() {
    return Lists.newArrayList(customerRepository.findAll());
  }
}
