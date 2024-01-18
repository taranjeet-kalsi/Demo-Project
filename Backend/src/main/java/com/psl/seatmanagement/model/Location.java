package com.psl.seatmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    Long id;
    String officeName;
    City city;
    @ElementCollection
    @CollectionTable(name = "building", joinColumns = @JoinColumn(name="locationId"))
    List<Building> buildings;
}
