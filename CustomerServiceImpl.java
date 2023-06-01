package com.example.pvpsvc.service.impl;

import com.example.pvpsvc.model.entity.CustomerEntity;
import com.example.pvpsvc.model.request.CustomerRequest;
import com.example.pvpsvc.repository.CustomerRepository;
import com.example.pvpsvc.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerEntity> getCustomerAns(CustomerRequest query) {
        return repository.findByQueContainingIgnoreCase(query.getQuery());
    }

}

