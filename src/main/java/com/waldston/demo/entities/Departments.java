package com.waldston.demo.entities;

public class Departments {

	private Long id;
	private String name;
	
	public Departments() {
		
	}
	
	
	
	public Departments(Long id, String name) {
		this.id = id;
		this.name = name;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
