package com.bg;

import java.util.Scanner;

public class AremstrongNum {
	static boolean isArmstrong(int n) {
		int a, digits = 0, last = 0, sum = 0;
		a = n;
		while (a > 0) {
			a = a / 10;
			digits++;
		}
		a = n;
		while (a > 0) {
			last = a % 10;
			sum += (Math.pow(last, digits));
			a = a / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		num = sc.nextInt();
		if (isArmstrong(num)) {
			System.out.println(num + " is a Armstrong Number.");
		} else {
			System.out.println(num + " is not a Armstrong Number.");
		}

	}

}
