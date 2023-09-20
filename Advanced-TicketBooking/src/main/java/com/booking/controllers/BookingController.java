package com.booking.controllers;


import com.booking.entities.BookTicket;
import com.booking.services.BookTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
public class BookingController {

    @Autowired
    public BookTicketService bookTicketService;

    public ResponseEntity<String> addTicket(@RequestBody BookTicket bookTicket){
          this.bookTicketService.save(bookTicket);
         return ResponseEntity.ok("ticket booking successfully");

    }
}
