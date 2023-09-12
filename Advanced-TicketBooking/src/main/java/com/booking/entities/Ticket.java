package com.booking.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    private Long trainNo;

    private String source;

    private String destination;

    private double priceSleeper;

    private double price3AC;

    private double price2AC;

    private double price1AC;

    private String time;

    private Integer totalSlepperSheetLeft;

    private Integer total3ACSheetsLeft;

    private Integer total2ACSheetsLeft;
    private Integer total1ACSheetsLeft;

}
