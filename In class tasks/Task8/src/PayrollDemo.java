/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #8 \
 * This program is a user interface class that takes user input for employee hours worked and hourly pay rates.
 * Then validating the input and  displaying payroll data with gross pay for each employee.
 */

import java.util.Scanner; // Scanner to read input from user
import java.text.DecimalFormat; // DecimalFormat to format decimal numbers

public class PayrollDemo 
{
	private static Scanner user; 
	
public static void main(String[] args) 
	{
	
	int hours; // Declaring integer for variable hours
	double payRate; // Declare a double variable for hourly pay rate 
	
	user = new Scanner(System.in); // Initializing scanner
	
	Payroll pr = new Payroll(); // Creating instance of Payroll class
	
	for (int i =0; i < Payroll.NUM_EMPLOYEES; i++) // crating a for loop through each employee
	{
		System.out.print("Enter the hours worked by the employee " + "number " + pr.getEmployeeID(i) + ": "); 
		
		hours = user.nextInt(); 
		
		while (hours < 0) 
		{ 
			System.out.println("Error: Hours worked can not be negative. Please enter a valid value:"); 
			hours = user.nextInt(); 
		}
		
		System.out.print("Enter the hourly pay rate for employee " + "number " + pr.getEmployeeID(i) + ": "); 
		payRate = user.nextDouble(); 
		
		while (payRate < 6) // Validating that payRate is not less than $6
		{ 
			System.out.println("Error: Pay rate cannot be less than $6 per hour. Please enter a valid pay rate. "); 
			payRate = user.nextDouble(); 
		}
		
		pr.setHoursWorked(i, hours); // Setting hours worked for current employee
		pr.sethourlyRate(i, payRate); // Setting hourly rate for current employee
	}
	
	DecimalFormat dollar = new DecimalFormat("#,##0.00"); // Creating decimal format object to format currency values
	
	System.out.println("\nPAYROLL DATA" + "\n============="); // Printing a header for summary 
	for (int i =0; i < Payroll.NUM_EMPLOYEES; i++) // Creating a for loop through each employee to display payroll data
	{ 
		System.out.println("Employee ID: " + pr.getEmployeeID(i) + 
				"\nGross Pay: $" + dollar.format(pr.calculateGrossPay(i)) + "\n"); // Printing each EmployeeID and formatted gross pay
		}
	}
}