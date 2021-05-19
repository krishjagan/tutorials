package com.my_tutorials.java8.utils;

import com.my_tutorials.java8.dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

	public static List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(4, "Nidhanya", 1000000, "Nidhanya@gmail.com", Arrays.asList(12345, 56789),"Kid"));
		employees.add(new Employee(1, "Krishna", 500000, "Krishna@gmail.com", Arrays.asList(96262, 68814),"HM"));
		employees.add(new Employee(3, "Dhivya", 400000, "Dhivya@gmail.com", Arrays.asList(96262, 68375),"IT"));
		employees.add(new Employee(2, "Gowtham", 600000, "Gowtham@gmail.com", Arrays.asList(98765, 43210),"Kid"));
		employees.add(new Employee(5, "BadData", 600000, null, Arrays.asList(98765, 43210),"Bad"));

		return employees;
	}

}
