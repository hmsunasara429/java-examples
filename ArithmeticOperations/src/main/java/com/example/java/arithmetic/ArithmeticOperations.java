package com.example.java.arithmetic;

import java.util.Scanner;

/**
 * This class is used to perform arithmetic operations.
 * @version v1.0
 * @since v1.0
 * @author Hasan Sunasara
 */
public class ArithmeticOperations 
{
	/**
	 * Constant multiplier value
	 */
	public static int MULTIPLIER = 10;
	
    public static void main( String[] args )
    {
    	
    	Scanner scanner=new Scanner(System.in);
    	
    	/* Read value1 */
    	System.out.println("Enter value 1:");
    	int iValue1 = scanner.nextInt();
    	
    	/* Read value2 */
   	 	System.out.println("Enter value 2:");  
   	 	int iValue2 = scanner.nextInt();  
    	
    	ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    	
    	/* Addition opertion */
    	int iAddition = arithmeticOperations.add(iValue1, iValue2);
    	 
    	/* Multiplication operation */
    	int iAnswer = arithmeticOperations.multiply(iAddition);
    	
    	System.out.println("The answer is: "+iAnswer);  
    	 
    	scanner.close();  
    }

	/**
	 * Multiplies the number with a constant multiplier
	 * @param iValue multiplicand value
	 * @return multiplication result
	 * @since v1.0
	 * @author Hasan Sunasara
	 */
    public int multiply(int iValue) {
		return iValue * MULTIPLIER;
	}
    
    /**
	 * Adds two numbers
	 * @param iValue1 number1
	 * @param iValue2 number2
	 * @return addition result
	 * @since v1.0
	 * @author Hasan Sunasara
	 */
	public int add(int iValue1, int iValue2) {
		return iValue1 + iValue2;
	}
}
