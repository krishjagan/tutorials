package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) throws Exception {

		List<Employee> employees = Database.getEmployees();

		// 4, 5, 10 are the values provide different output
		Employee employee = employees.stream().filter(e -> e.getId() == 5).findFirst()
				.orElseThrow(() -> new Exception("No customer available for the given id"));
		System.out.println(employee);

		// an Optional with a present value if the specified value is non-null, otherwise an empty Optional
		Optional<String> email2 = Optional.ofNullable(employee.getEmail());
		System.out.println(email2.orElse("value not found"));

		// an Optional with the value present //Throws: NullPointerException – if value is null
		Optional<String> email = Optional.of(employee.getEmail());
		System.out.println(email.orElse("value not found"));

	}

}
