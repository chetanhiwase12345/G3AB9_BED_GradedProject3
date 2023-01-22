package com.greatlearning.tickettracker.services;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.tickettracker.repository.Repository;
import com.greatlearning.tickettracker.model.TicketTrackerEntity;

@Service
public class TicketService implements Service {

	// autowiring the ticketrepo class
	@Autowired
	private Repository ticketRepo;

	// creating ticket function
	public void addTicket(TicketTrackerEntity t) {

		ticketRepo.save(t);
	}

	// reading tickets
	public List<TicketTrackerEntity> getAllTickets() {
		return ticketRepo.findAll();
	}

	// finding ticket by id to edit and update ticket
	public TicketTrackerEntity getTicketById(int id) {

		Optional<TicketTrackerEntity> t = ticketRepo.findById(id);
		if (t.isPresent()) {
			return t.get();
		}
		return null;

	}

	// delete function
	public void delTicket(int id) {

		ticketRepo.deleteById(id);
	}

	// search function
	public List<TicketTrackerEntity> getByKeyword(String keyword) {
		return ticketRepo.findByKeyword(keyword);
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
