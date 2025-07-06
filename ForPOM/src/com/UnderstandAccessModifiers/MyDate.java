package com.UnderstandAccessModifiers;

public class MyDate {
	private int day;
	private String month;
	private static int year;
	
	public MyDate(int day, String month, int y) {
		super();
		this.day = day;
		this.month = month;
		year = y;
	}

	public void displayDate()
	{
		System.out.println(day + "-" + month + "-" + year);
	}
	
	public static void setYear(int y)
	{
		year = y;
	}
}
