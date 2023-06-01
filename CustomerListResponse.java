package com.example.pvpsvc.model.response;

import com.example.pvpsvc.model.dto.CustomerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListResponse implements Serializable {
    private List<CustomerDto> customers;
}
