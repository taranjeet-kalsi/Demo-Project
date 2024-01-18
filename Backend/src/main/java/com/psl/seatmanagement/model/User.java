package com.psl.seatmanagement.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public abstract class User {
    String name;
    String email;
    String password;
    Date dob;
    Role role;

    void bookSeat(){

    }
    void viewBooking(){

    }

}
