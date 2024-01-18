package com.psl.seatmanagement.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    Long id;
    String name;
    @ElementCollection
    @CollectionTable(name = "floor", joinColumns = @JoinColumn(name="buildingId"))
    List<Floor> floors;
}
