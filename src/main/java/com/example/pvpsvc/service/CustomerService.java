package com.example.pvpsvc.service;

import com.example.pvpsvc.model.entity.CustomerEntity;
import com.example.pvpsvc.model.request.CustomerRequest;

import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getCustomerAns(CustomerRequest query);
}
