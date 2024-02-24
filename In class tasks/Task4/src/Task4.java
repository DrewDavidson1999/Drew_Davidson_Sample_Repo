/* Author: [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #4
 * This program takes user input for the sales of 5 different stores, then takes those stats and translates them into a chart with *'s representing $100 for each store
 */

import java.util.Scanner; // Importing scanner

public class Task4 {

    public static void main(String[] args) 
    {
        
    	Scanner keyboard = new Scanner(System.in); // Creating a name for the scanner  

        int[] StoreSales = new int[5]; // The input 5 is used to determine how many stores
    
        for (int store = 0; store < 5; store++) // Creating a loop to identify what store 1-5  
        { 
            System.out.printf("What are today's sales for store " + (store + 1) + ": $"); // Asking user to input sales for store 1-5, the number of the store auto changes after each user input counting in order from 1 to 5
            StoreSales[store] = keyboard.nextInt(); // Taking user input for store sales 
        }
        
        System.out.println("\nSales Bar Chart for each Store:"); // Printing out text before the bar chart
        for (int store = 0; store < 5; store++) // Creating loop 
        {
            System.out.printf("Store " + (store + 1) + ": "); // Going to the next input for the following store chaning the store number in order from 1-5 

            int asterisks = StoreSales[store] / 100; // Using 1 * per every $100 of sales from a store, this is done by taking the stores sales and dividing that int by 100 

            for (int d = 0; d < asterisks; d++) // Creating a for loop to determine the amount of *'s
            {
                System.out.printf("*"); // Printing out the *'s for each $100 a store had in sales for the day 
           }
            System.out.println(); // Making sure the *'s print to the next store line instead of on the same line
        }
    }
}