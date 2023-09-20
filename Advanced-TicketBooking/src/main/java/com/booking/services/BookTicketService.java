package com.booking.services;

import com.booking.entities.BookTicket;
import com.booking.repositorys.BookTicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BookTicketService {

    @Autowired
    private BookTicketRepo bookTicketRepo;

    public void save(BookTicket bookTicket){
        //need to add logic

    }






    public Optional<BookTicket> getTicketDetails(Long tickId){
        return bookTicketRepo.findById(tickId);
    }
}
