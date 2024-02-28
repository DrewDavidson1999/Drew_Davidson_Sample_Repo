/** Author: [Drew Davidson]
 *  Class: MIST352-Spring24
 *  Homework #2
 * 
 */ 

public class ExtraCredit{
	
	public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) { // Creating a for loop for number 1-100 
            int sum = 0; // initializing the sum variable 
            
            for (int j = 1; j <= num; j++) { // Creating an inner loop, j is added to the sum variable 
                sum += j;
            }
            System.out.println(num + sum);
        }
    }
}