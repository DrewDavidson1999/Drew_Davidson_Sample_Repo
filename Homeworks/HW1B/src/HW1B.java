// Author: [Drew Davidson]
// Class: MIST352-Spring24
// Homework #1B
// This program asks the user for an input, following that the program runs the users inputs to text, this does not happen if all the inputs are not given 

import java.util.Scanner; // import java.util which is needed for the Scanner class

public class HW1B 
{
	public static void main(String[] args) 
	{
		// Create a scanner to allow the user input 
		Scanner keyboard = new Scanner(System.in); // Create a scanner 
		
		System.out.println("Enter Value for numberAsString?"); // Asking for user input 
		
	      // declaring a string variable - Changed Int to numberAsString, Int does not work as a string  
		String numberAsString = keyboard.next();
		
		// User input for int that accepts integers, decimals are not needed 
		System.out.println("Enter another number");
		
		// Declaring an integer variable - Changed String to Int, Int is for integer not a String 
		int number = keyboard.nextInt();
		
		//Printing a message asking either "True" or "False" for boolean 
		System.out.println("True or False");
		
		// Declaring a boolean variable - Added != null; to tell the system that there is no reference assigned 
		boolean flag = keyboard.nextBoolean(); // This should be a boolean value 
		
		// Ask user to input a number with a decimal 
		System.out.println("Enter a number with a decimal");
		
		// Declaring a double variable - double only holds numbers and decimals "f" cannot be in a decimalNumber
		double decimalNumber = keyboard.nextDouble();
		
		// Printing a greeting message with new line - Added quotes around "Hello World\n" to compile so System.out.println would work
		System.out.println("Hello World\n");
		
		// Printing tabbed text - Added quotes around "\tTabbed text" to print the text, this would not work without quotes
		System.out.println("\tTabbed text");
		
		// Printing a variable - I quoted out this undeclared variable so it does not appear in the output when running the code 
		//System.out.println("undeclaredVariable");
		
		// Concatenating string with integer using escape sequences - Added a end quote around "Value of Number: \t" the quotes were done incorrectly
		System.out.println("Value of Number: \t" + number + "\nValue of numberAsString:\t" + numberAsString);
		
		// Declaring a constant - Added final before double, final must be infront of double to declare it as a constant 
		final double PI = 3.14159;
		
		// Printing a complex message - I did not change this line of code, it was correct 
		System.out.println("The Value of flag is " + flag + ", and the decimal number is " + decimalNumber);
		
		// Printing a test message - I commented out this section of code, the text "This is a test." is not in the desired output for this program 
		//System.out.println("This is a test.");
		
	
	}
}