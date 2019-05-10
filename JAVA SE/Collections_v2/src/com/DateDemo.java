package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		/*
		Date d=new Date();
		System.out.println(d);
		System.out.println("Year: "+(d.getYear()+1900));
		System.out.println("Month: "+(d.getMonth()+1));
		System.out.println("Day: "+d.getDate());
		
		*/
		
		String dob="5:10:2019";
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM:dd:yy");
		Date d=sdf.parse(dob);
		
	
		
		System.out.println(d);
		
		// COnverrt date into string
		
		String date=sdf.format(d);
		
		System.out.println(date);
		
		
		
		
		
		
		
	}

}
