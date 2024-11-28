package com.umesh.budgetplanner.BudgetAPI.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
	public Users() {
		
	}
	
	@GeneratedValue
	@Id
	private int id;
	private String user_name;
	private String password;
	
	@OneToMany(mappedBy = "users")
	@JsonIgnore
	private List<Project> project;

	public Users(int id, String user_name, String password, List<Project> project) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.project = project;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", user_name=" + user_name + ", password=" + password + ", project=" + project + "]";
	}
	
}
