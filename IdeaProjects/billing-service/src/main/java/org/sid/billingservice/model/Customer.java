package org.sid.billingservice.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
}
