
package DayOneProblems;
import java.util.Scanner;
public class Static {
		//static variables
		
		static int num1 = 10;
		static int num2 = 19;
		static int num3 = 54;

		public static void main(String[] args) {
			s1();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("the static variables :"+num1 + ','+ num2 +','+num3);
			
			sum(sc.nextInt(),sc.nextInt(),sc.nextInt());

		}
		//static method and block
		
		static void s1 () {
			System.out.println("this is static method");
			
			
			
		}
		
		static void sum (int x,int y,int z) {
			System.out.println(x+y+z);
		}

}
