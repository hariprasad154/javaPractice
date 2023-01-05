package Prepinsta;
import java.util.Scanner;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner src=new Scanner (System.in);
		int num=src.nextInt();
		int num2=src.nextInt();
		int flag=0;
		int[] arr= new int[num2];
		int count=0;
		for (int i=num ;i<num2;i++) {
			flag=0;
			for (int j =2;j<i;j++) {
				if (i<2) {
					System.out.println("the number less than 2");
					break;
				}
				else if (i % j==0) {
					flag=flag+1;
					}else {
					flag=flag;
				}
			}
			if (flag >0) {
				//System.out.println(i+"not prime");

			}
			else {
				arr[count]=i;
				count++;
				//System.out.println(i+"prime");
			}


		}

		for (int k :arr) {

			if (k!=0) {
				System.out.print(k+",");
			}
		}

	}

}
