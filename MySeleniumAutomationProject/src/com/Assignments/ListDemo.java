package com.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String>students = new ArrayList<>();
		students.add("Vinayak");
		students.add("Pravin");
		students.add("Vasundhara");
		students.add("Pravin");
		students.add("Ankush");
		
		//System.out.println(students.get(0));
		
		System.out.println("Total Elements in List: " + students.size());
		
		//for(int i = 0; i < students.size(); i++)
		//		System.out.println(students.get(i));
		
		for(String s : students)
			System.out.println(s);
		
		Collections.sort(students);
		
		System.out.println(students);
		
		List<Integer>nos = new ArrayList<>();
		nos.add(11);
		nos.add(1);
		nos.add(444);
		nos.add(3);
			
		Collections.sort(nos);
		System.out.println(nos);
	}

}
