package com.psl.seatmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Map;

@Entity
public class Floor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    Long id;
    String name;
    Integer noOfSeats;
    Integer availableSeats;
//    Map<Integer,Employee> seatStatus;
}
