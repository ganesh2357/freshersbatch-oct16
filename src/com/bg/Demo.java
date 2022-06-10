package com.bg;

public class Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 0;

		System.out.println("Ganesh");
//		System.out.println(a%b);
//		System.out.println(++a);
//		System.out.println(a++);
//		if(a>5) {
//			System.out.println("888888888");
//			if(a<5) {
//				System.out.println("*********");
//				c=a+b;
//			}
//			a--;
//		}

//		if(a<4) {
//			System.out.println("A is small");
//		}
//		else if(a>10) {
//			System.out.println("A is big");
//		}
//		else {
//			System.out.println("it's ok");
//		}

//		int y=(a<7) ? 5 : 9;
//		System.out.println(y);
//
//		switch(a) {
//		case 2:{
//			System.out.println("A=2");
//		}
//		case 10:{
//			System.out.println("A=10");
//		}
//		}

//		printing n numbers,even or odd num
		int count = 1;
		int x = 20;
		while (count <= x) {
			if (count % 2 != 0) {
				System.out.println(count);
			}
			count++;
		}
//		
//		int n,m;
//		for(n=0, m=0; n<10; n++, m+=2) {
//			System.out.println(m);
//		}
		
//		Enhanse for-loop
		String[] names= {"Ganesh","Suresh","Ramesh"};
		for(String s:names) {
			System.out.println(s.toString());
		}
	}

}
