package com.bridgelabs;

public class HowJavaWorks {
	int i;
	int j;
	static int k;
	static int t=100;
	public static void main(String[] args) {
		System.out.println("1st " + k);
		System.out.println(t);
		HowJavaWorks p = new  HowJavaWorks();
		p.i=10;
		System.out.println("p in i"+p.i);
		HowJavaWorks p2 = new  HowJavaWorks();
		p2.i=20;
		p2.j=233;
		System.out.println("calling p2.i "+p2.i);
		System.out.println("calling p1.i "+p.i);
		
		System.out.println("------------------");
		System.out.println(p.i);
		System.out.println(p2.j);
		System.out.println(k );
		System.out.println(t);
	}

}
