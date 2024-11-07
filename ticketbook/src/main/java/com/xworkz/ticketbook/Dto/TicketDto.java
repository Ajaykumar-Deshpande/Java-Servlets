package com.xworkz.ticketbook.Dto;

import java.io.Serializable;

public class TicketDto implements Serializable {
	private String stadiumName;
	private int ticket;
	private String primaryContext;
	private String email;

	public TicketDto() {
		System.out.println("no argument constructor Dto");
	}

	public TicketDto(String stadiumName, int ticket, String primaryContext, String email) {
		super();
		this.stadiumName = stadiumName;
		this.ticket = ticket;
		this.primaryContext = primaryContext;
		this.email = email;

	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((primaryContext == null) ? 0 : primaryContext.hashCode());
		result = prime * result + ((stadiumName == null) ? 0 : stadiumName.hashCode());
		result = prime * result + ticket;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketDto other = (TicketDto) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (primaryContext == null) {
			if (other.primaryContext != null)
				return false;
		} else if (!primaryContext.equals(other.primaryContext))
			return false;
		if (stadiumName == null) {
			if (other.stadiumName != null)
				return false;
		} else if (!stadiumName.equals(other.stadiumName))
			return false;
		if (ticket != other.ticket)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TicketDto [stadiumName=" + stadiumName + ", ticket=" + ticket + ", primaryContext=" + primaryContext
				+ ", email=" + email + "]";
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public String getPrimaryContext() {
		return primaryContext;
	}

	public void setPrimaryContext(String primaryContext) {
		this.primaryContext = primaryContext;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
