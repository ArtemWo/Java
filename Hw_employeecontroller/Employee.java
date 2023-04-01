package org.example.Hw_employeecontroller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Employee{

	private String id;
	private String name;
	private String surname;
	private int age;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(String name) {
		this.id= UUID.randomUUID().toString();
		this.name = name;
	}

}
