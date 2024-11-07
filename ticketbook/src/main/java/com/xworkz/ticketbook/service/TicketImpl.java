package com.xworkz.ticketbook.service;

import com.xworkz.ticket.repo.RepositoryImpl;
import com.xworkz.ticket.repo.TicketRepository;
import com.xworkz.ticketbook.Dto.TicketDto;

public class TicketImpl implements Ticket {

	@Override
	public boolean isValidAndSave(TicketDto TicketDto) {
		boolean check = true;
		if (TicketDto != null) {
			int tickets = TicketDto.getTicket();
			if (tickets > 0) {
				System.out.println("tickets is valid");
			} else {
				System.err.println("tickets is invalid");
				check = false;
			}

			String email = TicketDto.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Given email is valid....");
			} else {
				System.err.println("Given email is Invalid....");
				check = false;
			}
		}
		TicketRepository ticketRepositoryImp=new RepositoryImpl();
		int pk=ticketRepositoryImp.save(TicketDto);
		if(pk>0) {
			System.out.println("data saved into database");
			check=true;
			
		}
		else {
			System.out.println("data not saved into database");
			check=false;

		}
		return check;
	}

}
