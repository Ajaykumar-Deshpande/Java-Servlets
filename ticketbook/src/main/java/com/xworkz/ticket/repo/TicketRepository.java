package com.xworkz.ticket.repo;

import com.xworkz.ticketbook.Dto.TicketDto;

public interface TicketRepository {
	int save(TicketDto ticketDto);

}
