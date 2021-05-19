package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Database.getEmployees();
		
		// get the employees by department and sort by key and then print it
		employees.stream().collect(Collectors.groupingBy(Employee::getDep)).entrySet().stream()
		.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// get the count of employees by department and sort by key and then print it
		employees.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
