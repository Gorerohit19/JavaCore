package com.example.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Tostring
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(Stratagy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer 

    
}
