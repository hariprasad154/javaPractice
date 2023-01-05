package Prepinsta;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int num=src.nextInt();
		int rem=0 ;
		int reverse=0;
		int original=num;
		
		while (num!=0) {
			rem=num%10;
			reverse=reverse *10 +rem;
			num=num/10;
		}
		System.out.println(reverse);
		
		if (original == reverse) {
			System.out.println(original+"is palindrome ");
			
		}else {
			System.out.println("not Palindrome");
		}

	}

}
