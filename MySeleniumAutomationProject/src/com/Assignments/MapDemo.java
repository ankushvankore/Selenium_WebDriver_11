package com.Assignments;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String>students = new HashMap<>();
		students.put(1, "Pravin");
		students.put(2, "Vinayak");
		students.put(3, "Ankush");
		students.put(4, "Pravin");
		students.put(2, "Harshada");
		
		System.out.println(students);
		
		System.out.println(students.get(1));
	}

}
