package com.booking.repositorys;

import com.booking.entities.BookTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTicketRepo extends JpaRepository<BookTicket,Long> {
}
