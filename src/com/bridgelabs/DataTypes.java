package com.bridgelabs;

//Data types -> 2 types
//primitive and non-primitive
//primitive -> byte,short,int,long,float,double,char,boolean
//non-primitive -> class,interface,enum,arrays

public class DataTypes {
	
	public static void main (String[] args) {
//		long a = -2147483699l;
//		int b= (int)a;
//		System.out.println(b);
		
		 // variable -> a container where we can store some data
        int x = 0; // 0
        byte y = 12; // 0
        short s = 3; // 0
        long l = 5; // 0
        float f = 4.5F; // 0.0F
        double d = 3.6; // 0.0
        char ch = 'R';
        boolean b = true; // false

        System.out.println(x + " , " + y + " , " + s );
        System.out.println(y);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(b);
     // There is no requirement of type casting when we are storing lower data type variable into higher data type variable.
     // Whenever we are trying to store a higher data type variable to a lower data type variable , typecasting is mandatory
     // If the value taken in higher data type variable falls in the range of lower data type variable, there will not be any data loss
     // If the value taken in higher data type variable does not fall in the range of lower data type variable, there will be data loss
		
	}
	//  String str = "ABC435dsfvvdASDAS";
	

  // byte	1 byte	Stores whole numbers from -128 to 127
  // short 2 bytes Stores whole numbers from -32,768 to 32,767
  // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
  // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  // float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
  // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
  // boolean 1 bit	Stores true or false values
  // char 2 bytes	Stores a single character/letter or ASCII values

}
