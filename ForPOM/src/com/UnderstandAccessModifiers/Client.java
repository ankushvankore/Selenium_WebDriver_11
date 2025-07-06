package com.UnderstandAccessModifiers;

public class Client {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(6, "July", 2022);
		
		d1.displayDate();
		
		MyDate d2 = new MyDate(6, "July", 2024);
		MyDate d3 = new MyDate(6, "July", 2023);

		MyDate.setYear(2025);
		
		d1.displayDate();
		d2.displayDate();
		d3.displayDate();
	}

}
