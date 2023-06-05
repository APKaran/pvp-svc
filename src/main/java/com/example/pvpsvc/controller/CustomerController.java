package com.example.pvpsvc.controller;

import com.example.pvpsvc.model.entity.CustomerEntity;
import com.example.pvpsvc.model.request.CustomerRequest;
import com.example.pvpsvc.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @CrossOrigin
    @PostMapping(path="/api/customer/query",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<CustomerEntity>> getCustomerAns( @RequestBody CustomerRequest request) {
        List<CustomerEntity> list = customerService.getCustomerAns(request);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
