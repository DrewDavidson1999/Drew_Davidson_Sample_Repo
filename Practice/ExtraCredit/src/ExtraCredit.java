/** Author: [Drew Davidson]
 *  Class: MIST352-Spring24
 *  Extra Credit 
 *  This program sums the numbers from 1-100, summing all the numbers from 1-100 in order 
 */ 

public class ExtraCredit{
	
	public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) { // Creating a for loop for number 1-100 
            int sum = 0; // initializing the sum variable 
            
            for (int n = 1; n <= num; n++) { // Creating an inner loop, n is the for loop variable 
                sum += n; // adding the variable n to sum 
            }
            System.out.println(sum); // Printing the outcome of the loop (num + sum)
        }
    }
}