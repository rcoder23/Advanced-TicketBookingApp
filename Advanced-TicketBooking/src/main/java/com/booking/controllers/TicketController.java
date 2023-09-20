package com.booking.controllers;


import com.booking.entities.Ticket;
import com.booking.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @GetMapping("/check")
    public ResponseEntity<String> justCheck(){
        return ResponseEntity.ok("controller");
    }


    @PostMapping("/add")
    public ResponseEntity<String> addNewRecord(@RequestBody Ticket ticket){
        this.ticketService.save(ticket);
        return  ResponseEntity.ok("Train Record Added Successfully");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Ticket>> getAllRecord(){
        return ResponseEntity.ok(this.ticketService.getAll());
    }


}
