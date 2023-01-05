package Prepinsta;

import java.util.Scanner;


public class Greatesto_f2_nums {
	

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int num1=src.nextInt();
		int num2=src.nextInt();
		
		if (num1<num2) {
			System.out.println(num2+" -is greater");
			
		}
		else {
			System.out.println(num1 + " is grater" );
		}
		

	}

}
