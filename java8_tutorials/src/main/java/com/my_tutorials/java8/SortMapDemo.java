package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {

		int someIndex = 100;

		// by default sort by name
		Map<Employee, Integer> employeeMap = new TreeMap<Employee, Integer>(
				(e1, e2) -> e1.getName().compareTo(e2.getName()));

		for (Employee e : Database.getEmployees())
			employeeMap.put(e, someIndex++);

		// sort using tree map
		employeeMap.entrySet().stream().forEach(System.out::println);

		// sort by key using stream
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
				.forEach(System.out::println);

		// sort by value
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
