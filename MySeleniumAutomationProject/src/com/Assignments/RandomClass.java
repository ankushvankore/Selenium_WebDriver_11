package com.Assignments;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random rnd = new Random();
		int i = rnd.nextInt(5);		//Will return any random value in the range of 0 to 4
		System.out.println(i);
		System.out.println("i");
	}

}
