// Author: [Drew Davidson]
// Class: MIST352-Spring24
// Homework #1
// This program prints text saying "Hello World" then takes the numbers inputted and tells us the value of the flag True or False, and if true it prints the decimal number 3.144

public class HW1 {
	
	public static void main(String[] args) 
	{
		// declaring a string variable - Changed Int to numberAsString, Int does not work as a string  
		String numberAsString = "1234";
		
		// Declaring an integer variable - Changed String to Int, Int is for integer not a String 
		int number = 5678;
		
		// Declaring a boolean variable - Added != null; to tell the system that there is no reference assigned 
		boolean flag = "true" != null; // This should be a boolean value 
		
		// Declaring a double variable - double only holds numbers and decimals "f" cannot be in a decimalNumber
		double decimalNumber =3.14;
		
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
