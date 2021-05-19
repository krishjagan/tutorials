package com.my_tutorials.java8.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id;
	private String name;
	private double salary;
	private String email;
	private List<Integer> phone;
	private String dep;

}
