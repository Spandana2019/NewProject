package com.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.saample.dto.Employee;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee("001", "test", "test");
		Employee e2 = new Employee("001", "test", "test");

		System.out.println("Result of comparision : " + e1.equals(e2));

		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);

		System.out.println("HashSet size = " + set.size());
		System.out.println("HashSet contains Test = " + set.contains(new Employee("001", "test", "test")));
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, e1);
		map.put(2, e2);
		
		System.out.println("HashMap map size = " + map.size());
		System.out.println("HashMap contains Test = " + map.containsValue(e1));
		
		Map<Employee, Integer> map1 = new HashMap<Employee, Integer>();
		
		map1.put(new Employee("001", "test", "test"), 10);
		map1.put(new Employee("001", "test", "test"), 20);
		
		System.out.println("HashMap map1 size = " + map1.size());
		System.out.println("HashMap contains Test = " + map1.containsKey(new Employee("001", "test", "test")));
		
		
		
		

	}

}
