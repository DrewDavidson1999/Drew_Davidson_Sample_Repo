/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #6
 * This program creates an HTMl document using user inputed information and then saves it to a file named "Task6.html" 
 */

package Task6;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task6
{
	public static void main(String [] args) throws IOException 
	{
		Scanner scnUserInput = new Scanner(System.in); // Creating a new scanner 
	
		System.out.printf("Enter your name: "); // Printing out a message to user asking them to input name 
		String Name = scnUserInput.nextLine(); // Creating a string called "Name" to hold users input 
		
		System.out.printf("Describe yourself: "); // Printing out a message to user asking them to enter a description of themselves
		String UserDesc = scnUserInput.nextLine(); // Creating a string called "UserDesc" to hold users input 
		
		// Using user input to create an HTML document 
		String html = "<html>\n" + "<head>\n" + "<head>\n" + "<body>\n" + 
				"<head>\n" + "<center>\n" + "<h1>\n" + Name + "</h1>" + 
				"</center>\n" + "<h1 />\n" + UserDesc + "<h1 />\n" + 
				"</body>\n" + "</html>";
		
		FileWriter HTML = new FileWriter("Task6.html"); // Creating a file writer named Task6
		PrintWriter PrintWriter = new PrintWriter(HTML); // Creating a printwriter 
		
		PrintWriter.println(html); // Printing the contents of the html string to the printwriter  
		PrintWriter.close(); // Closing printwriter
		scnUserInput.close(); // Closing scnUserInput
		HTML.close(); // Closing HTML 
				
	}
}