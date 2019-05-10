package com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;

public class CalendarDemo {

	public static void main(String[] args) {

		System.out.println(Objects.hashCode(new String("Abc")));
		// Objects.equals(s1, s2)

		Calendar cl = Calendar.getInstance();
		System.out.println(cl);

		int[] nos = { 34, 32, 98, 2, 8, 332, 9 };

		Arrays.sort(nos);
		

		
		int x = Arrays.binarySearch(nos, 32);

		for (int no : nos) {
			System.out.println(no);
		}

		System.out.println("X value is " + x);

		System.out.println("Year: " + cl.get(Calendar.YEAR));
		System.out.println("Month: " + (cl.get(Calendar.MONTH) + 1));
		System.out.println("Date: " + cl.get(Calendar.DATE));

		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
		cl = sm.getCalendar();
		LocalDate ld = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println(ld.format(f));

		Date d = cl.getTime();
		// System.out.println(d);

	}

}
