package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {

	public static void main(String[] args) {

		List<Employee> employees = Database.getEmployees();
		
		List<String> emails = employees.stream().map(Employee::getEmail).sorted().collect(Collectors.toList());
		System.out.println(emails);
		
		List<Integer> phones = employees.stream().flatMap(e->e.getPhone().stream()).sorted().collect(Collectors.toList());
		System.out.println(phones);
		
	}

}
