package Prepinsta;
import java.util.Scanner;
public class SumOfFirstN_NaturalNumbers {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("enter the number");
		int num=src.nextInt();
		
		int sum=0;
		for (int i=0;i<= num ;i++ ) {
			
			sum=sum+i;
						
		}
		System.out.println("the sum of all numbers is " +sum);
		
	}

}
