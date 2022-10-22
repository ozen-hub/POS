package com.cmjd.batch96.POS.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// @Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
