package com.greatlearning.tickettracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//annotations to create constructors , getters and setters and tables in database

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tickets")
public class TicketTrackerEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "content")
	private String content;
	@Column(name = "date")
	private String date;

}
