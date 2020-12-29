package org.sid.billingservice.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Product {
    private long id;
    private  String name;
    private double price;
    private double quantity;
}
