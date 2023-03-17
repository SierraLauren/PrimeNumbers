 /*   
// AUTHOR: Sierra Whitham  
// FILENAME: Assignment1.java
// SPECIFICATION: Program asks user to input positive numbers or -1 to quit. The 
 * program determines if each number is prime and prints the sum, count, maximum,
 * minimum, and average of all the positive numbers entered.
// FOR: CS 1400 - ASSIGNMENT #4 
// TIME SPENT: 50 min.
//*/ 

import java.util.Scanner;
public class PrimeNumbers {

	public static void main( String args[] )
	{
		//scanner created
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter a positive integer. Enter -1 to quit." );
		int num = input.nextInt();
		
		//variables created
		int sum = 0; 
		int count = 0;
		int maximum = num;
		int minimum = num;
		
		while( num != -1 )
		{
			isPrime( num );
			sum += num;
			count++;
			
			if( num > maximum )
			{
				maximum = num;
			}//end if statement
			if( num < minimum )
			{
				minimum = num;
			}//end if statment
			
		
			System.out.println( "Enter a positive integer. Enter -1 to quit." );
			num = input.nextInt();
		}//end while loop

		System.out.println( "The maximum positive number is: " + maximum +
				"\n" + "The minimum positive number is: " + minimum + "\n"
				+ "The sum is: " + sum + "\n" + "The count of number(s) is: " 
				+ count );
		average( sum, count);
		
		//scanner closed
		input.close();
	}//end method main
	
	/**
	 * Checks if an int is prime or not
	 * 
	 * @param num	an int that will be tested if prime or not
	 */
	public static void isPrime( int num)
	{
		boolean prime = true;
		
		for( int index = 2; index <= num / 2; index++ ) {
			if( num % index == 0)
			{
				prime = false;
			}//end if statement
		}//end for loop
		
		if( prime )
		{
			System.out.println("The number " + num + " is a prime number. ");
		}//end if 
		else
		{
			System.out.println("The number " + num + " is not a prime number. ");
		}//end else
		
	}//end method isPrime
	
	/**
	 * calculates the average value of all positive values
	 * 
	 * @param sum 	an int that is the total sum of all positive values
	 * @param count an int that is the total number of all positive values
	 */
	public static void average( int sum, int count )
	{
		double average = ((double) sum ) / count;
		System.out.printf( "The average is: %.2f", average );
	}//end method average
	
}//end class Assignment4
