package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
public class MapAndReduceDemo {

	public static void main(String[] args) {

		// get min number
		int num = IntStream.range(1, 6).reduce(Integer::min).getAsInt();
		System.out.println("Min number :" + num);

		// get the max number
		num = IntStream.range(1, 6).reduce(Integer::max).getAsInt();
		System.out.println("Max number :" + num);

		List<Employee> employees = Database.getEmployees();

		// get sum of salary of employees whose dep is 'Kid'
		Double sumSalary = employees.parallelStream().filter(emp -> emp.getDep().equalsIgnoreCase("kid"))
				.map(e -> e.getSalary()).mapToDouble(n -> n).reduce(Double::sum).getAsDouble();
		System.out.println("Sum salary :" + sumSalary);

		// get avg salary of employees whose dep is 'Kid'
		Double avgSalary = employees.parallelStream().filter(e -> e.getDep().equalsIgnoreCase("kid"))
				.map(e -> e.getSalary()).mapToDouble(e -> e).average().getAsDouble();
		System.out.println("Avg Salary: " + avgSalary);

		// get the max length of the string in the list
		String maxLenSring = Arrays.asList("a", "ab", "java").parallelStream()
				.reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println("Max length String :" + maxLenSring);

		//log.e

	}

}
