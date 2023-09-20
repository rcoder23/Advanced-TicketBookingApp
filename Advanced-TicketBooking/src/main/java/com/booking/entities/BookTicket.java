package com.booking.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class BookTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookid;

    private String name;

    private String seatType;

    private String date;

    private String startLocation;

    private String endLocation;

    private String trainNo;



    public Long getBookid() {
        return bookid;
    }

    public String getName() {
        return name;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getDate() {
        return date;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public String getTrainNo() {
        return trainNo;
    }
}
