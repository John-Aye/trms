package dev.aye.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Events {

	private UUID event_id;
	private String username;
	private String location;
	private String event_type;
	private LocalDate event_date;
	private LocalTime event_time;
	private String event_desc;
	private String event_cost;
	private String event_grading;
	private String event_justification;
	private String pass_grade;
	
	public Events() {
		super();
		this.event_id = UUID.randomUUID();
		this.username = "";
		this.location = "";
		this.event_type = "";
		this.event_date = LocalDate.now();
		this.event_time = LocalTime.now();
		this.event_desc = "";
		this.event_cost = "";
		this.event_cost = "";
		this.event_grading = "";
		this.event_justification = "";
		this.pass_grade = "";
	}

	public Events(UUID event_id, String username, String location, String event_type, LocalDate event_date,
			LocalTime event_time, String event_desc, String event_cost, String event_grading,
			String event_justification, String pass_grade) {
		super();
		this.event_id = event_id;
		this.username = username;
		this.location = location;
		this.event_type = event_type;
		this.event_date = event_date;
		this.event_time = event_time;
		this.event_desc = event_desc;
		this.event_cost = event_cost;
		this.event_grading = event_grading;
		this.event_justification = event_justification;
		this.pass_grade = pass_grade;
	}

	public UUID getEvent_id() {
		return event_id;
	}

	public void setEvent_id(UUID event_id) {
		this.event_id = event_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public LocalDate getEvent_date() {
		return event_date;
	}

	public void setEvent_date(LocalDate event_date) {
		this.event_date = event_date;
	}

	public LocalTime getEvent_time() {
		return event_time;
	}

	public void setEvent_time(LocalTime event_time) {
		this.event_time = event_time;
	}

	public String getEvent_desc() {
		return event_desc;
	}

	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}

	public String getEvent_cost() {
		return event_cost;
	}

	public void setEvent_cost(String event_cost) {
		this.event_cost = event_cost;
	}

	public String getEvent_grading() {
		return event_grading;
	}

	public void setEvent_grading(String event_grading) {
		this.event_grading = event_grading;
	}

	public String getEvent_justification() {
		return event_justification;
	}

	public void setEvent_justification(String event_justification) {
		this.event_justification = event_justification;
	}

	public String getPass_grade() {
		return pass_grade;
	}

	public void setPass_grade(String pass_grade) {
		this.pass_grade = pass_grade;
	}
	
	
}
