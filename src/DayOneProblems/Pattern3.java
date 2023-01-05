package DayOneProblems;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, rows;  
		System.out.print("Enter the number of rows you want to print: ");  
		rows = 5  ;        
		for (i= 0; i<= rows-1; i++){  
			for (j=0; j<=i; j++){  
				System.out.print(j+ " ");  
			}   
			System.out.println("");   
		}   
		for (i=rows-1; i>=0; i--)  
		{  
			for(j=0; j <= i-1;j++)  
			{  
				System.out.print(j+ " ");  
			}  
			System.out.println("");  
		}  
	}

}
