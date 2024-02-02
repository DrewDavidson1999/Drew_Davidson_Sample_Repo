/* Author: Drew Davidson
 * Class: MIST352-Spring24
 * In Class Task #3 
 * This program calculates the amount of money left in an account after using the compunded interest formula given user inputed amounts
 */

import javax.swing.JOptionPane;

public class Task3 
{
	
	public static void main(String[] args)
	{
	
		//double A = Double.parseDouble(JOptionPane.showInputDialog("Enter the is the amount of money in the account after the specified number of years.")); // "No need to accept this variable from the user. 
	
		double P = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount that was originally deposited into the account.")); // To hold the principle amount that the account had originally deposited 

		double R = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate of the account.")); // To hold the annual interest rate 

		double N = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of times per year that the interest is compounded.")); // To hold the amount of times per year the interest is compounded 

		double T = Double.parseDouble(JOptionPane.showInputDialog("Enter the specified number of years the interest is compounded.")); // To hold the number of year the interest is compounded  

		double A = P *( 1+ (Math.pow(R, N*T )/N)); //Formula for compound interest 
		
		System.out.printf("After the compounded interest you are left with %f" , A); // Printing out the amount of money in the account after the compounded interest
		
		
		
		
	}
}
