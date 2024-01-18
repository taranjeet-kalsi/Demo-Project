package com.psl.seatmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee extends User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    long id;
    String designation;
    @ElementCollection
    @CollectionTable(name = "booking", joinColumns = @JoinColumn(name="EmployeeId"))
    List<Booking> bookings;
}
