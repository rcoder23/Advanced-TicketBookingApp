package com.booking.services;


import com.booking.entities.Ticket;
import com.booking.repositorys.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepo ticketRepo;


    public void save(Ticket ticket) {
        this.ticketRepo.save(ticket);
        return;
    }

    public List<Ticket> getAll() {
        return this.ticketRepo.findAll();
    }
}
