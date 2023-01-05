package Prepinsta;
import java.util.Scanner;
public class SumOfDIgits {
	static final Scanner sr=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int a=sr.nextInt();
		int sum=0;
		while(a!=0) {
			sum+=a%10 ;
			a=a/10 ;
		}
		System.out.println(sum);
	}
}