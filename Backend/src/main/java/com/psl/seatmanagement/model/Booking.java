package com.psl.seatmanagement.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    Long id;
    Date startDate;
    Date endDate;
    Date startTime;
    Date endTime;
    @OneToOne
    Floor floor;
    Integer seatNo;
}
