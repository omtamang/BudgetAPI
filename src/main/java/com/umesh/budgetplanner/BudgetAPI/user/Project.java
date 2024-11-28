package com.umesh.budgetplanner.BudgetAPI.user;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
	
	public Project() {
		
	}
	
	@GeneratedValue
	@Id
	private int id;
	private String project;
	private LocalDate start_date;
	private LocalDate end_date;
	private int total_hours;
	
	@ManyToOne
	private Users users;

	public Project(int id, String project, LocalDate start_date, LocalDate end_date, int total_hours, Users users) {
		super();
		this.id = id;
		this.project = project;
		this.start_date = start_date;
		this.end_date = end_date;
		this.total_hours = total_hours;
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public int getTotal_hours() {
		return total_hours;
	}

	public void setTotal_hours(int total_hours) {
		this.total_hours = total_hours;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", project=" + project + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", total_hours=" + total_hours + ", users=" + users + "]";
	}
	
}
