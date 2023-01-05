package Prepinsta;
import java.util.Scanner;
public class Sum_Range {
	static Scanner src=new Scanner (System.in);
	
	
	public static void main(String[] args) {
		int num1=src.nextInt();
		int num2=src.nextInt();
		
		int sum=0;
		
		for (int i=num1 ;i<=num2;i++) {
			sum=sum+i;
			
		
					
		}
		System.out.println("The Base value--"+num1);
		System.out.println("The top value is -- "+num2);
		System.out.println("The sum between two numbers is "+sum);
		

	}

}
