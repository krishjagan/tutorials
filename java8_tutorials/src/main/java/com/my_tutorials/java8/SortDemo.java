package com.my_tutorials.java8;

import com.my_tutorials.java8.dto.Employee;
import com.my_tutorials.java8.utils.Database;

import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {

		List<Employee> employees = Database.getEmployees();

		/*Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});*/
		
		//Comparator<Employee> nameComparator =  (e1, e2) -> e1.getName().compareTo(e2.getName());
		
		//Comparator<Employee> idComparator =  (e1, e2) -> e1.getId() - e2.getId();
		
		//Collections.sort(employees, idComparator);
		
		//System.out.println(employees);
		
		// ascending order
		//employees.stream().sorted(nameComparator).forEach(System.out::println);
		
		// descending order
		//employees.stream().sorted(idComparator.reversed()).forEach(System.out::println);
		
		
		employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);;

	}

}
