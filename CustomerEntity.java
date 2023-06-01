package com.example.pvpsvc.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String que;

    @Column
    private String ans;

    public CustomerEntity(String que, String ans){
        this.que = que;
        this.ans = ans;
    }
}
