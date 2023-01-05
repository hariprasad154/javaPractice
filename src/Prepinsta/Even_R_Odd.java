package Prepinsta;

import java.util.Scanner;

public class Even_R_Odd {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num %2 == 0) {
			System.out.println("The given number is Even....");
			
		}
		else {
			System.out.println("The given number is Odd........");
		}

	}

}
