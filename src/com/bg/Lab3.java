package com.bg;

import java.time.DayOfWeek;

public class Lab3 {

	public static void main(String[] args) {

		// Ex 1:
//		String daysOfWeek[] = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
//		for(int i=0;i<daysOfWeek.length;i++) {
//			System.out.println(daysOfWeek[i]);
		// both we can use to print elements in a array
//		}

//		for (String a : daysOfWeek) {
//			System.out.println(a.toString());
//		}
//		
//		for(String day :daysOfWeek) {
//			System.out.println(day);
//		}

//		for (int x = 6; x >= 0; x--) {
//			System.out.println(daysOfWeek[x]);
//		}

//		Ex 2 :
//		int a = 1;
//		while (a < 20) {
//			if (a % 2 == 0) {
//				System.out.println(a);
//
//			}
//
//			a++;
//		}
//
//		while (a < 20) {
//			if (a % 2 != 0) {
//				System.out.println(a);
//			}
//
//			a++;
//		}

		// Ex 3 :
//		for(int x=0;x<100;x++) {
//			if(x>=50 && x<=60) {
//				continue;
//			}System.out.println(x);
//		}
//		
		// Ex 4:

//		String[] daysOfMonth = { "january", "febraury", "march", "aprial", "may", "jun", "july", "august", "september",
//				"octomber", "november", "december" };
//		int count = 1;
//		while (count <= daysOfMonth.length) {
//			switch (count) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.println("There are 31 days in " + daysOfMonth[count - 1]);
//				break;
//			case 2:
//				System.out.println("There are 28 days in " + daysOfMonth[count - 1]);
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.println("There are 30 days in " + daysOfMonth[count - 1]);
//			}
//			count++;
//		}

		// Challenging Excercise

		int off = 4;
		boolean printing = false;
		int dayCount = 1;
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 7; y++) {
				if (printing == false) {
					System.out.print("    ");
					if (y == off) {
						printing = true;
					}
				} else if (dayCount < 10) {
					System.out.print(dayCount + "   ");
					dayCount++;
				} else {
					System.out.print(dayCount + "  ");
					dayCount++;
				}
			}
			System.out.println();
		}

	}

}
