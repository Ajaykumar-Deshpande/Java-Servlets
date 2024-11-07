package com.xworkz.ticketbook.service;

import com.xworkz.ticketbook.Dto.TicketDto;

public interface Ticket {
	boolean isValidAndSave(TicketDto ticketDto);

}
