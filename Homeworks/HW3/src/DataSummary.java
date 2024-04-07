/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * Homework #3
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class DataSummary 
{
	private String fileLocation; // Holds path for file employee data
	private double averageSalary; // Stores calculated average salary
	
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	// Calculating and returning the avg salary of all employees by reading their salaries from text file
	public double getAverage() throws FileNotFoundException 
	{
	    File file = new File(fileLocation); // Creating file object for data file
	    Scanner scanner = new Scanner(file); // Creating scanner to read data from file
	    double totalSalary = 0.0; // Sum of salaries
	    int employeeCount = 0; // Number of employees

	    while (scanner.hasNextLine()) 
	    {
	        String line = scanner.nextLine();
	        String[] parts = line.split(",");
	        try {
	            double salary = Double.parseDouble(parts[parts.length - 1]); 
	            totalSalary += salary;
	            employeeCount++;
	        } catch (NumberFormatException e) {
	 }
}
	    scanner.close(); // Closing scanner 

	    if (employeeCount > 0) 
	    {
	        return totalSalary / employeeCount;
	    } else {
	        return 0.0;
	    }
	}
	
	public void ViewEmployeeAndIDs() throws FileNotFoundException 
	{
		File data = new File(fileLocation); // Creating a File object for data file
		Scanner scnReader = new Scanner(data); // Creating scanner to read data from file
		while(scnReader.hasNext()) 
		{
			String strLine = scnReader.nextLine(); 
			
			System.out.println(strLine.split(",")[1]);
		}
		scnReader.close();
		
	}
	
	public void SearchEmployee(String strEmployee) throws FileNotFoundException 
	{
	    File file = new File(fileLocation); // Creating a File object for data file
	    Scanner scanner = new Scanner(file); // Creating canner to read data from file
	    StringBuilder results = new StringBuilder(); // Creating string for lines in text file that match user input 
	    boolean found = false;

	    // Reading each line checking if it contains the search term then adding results 
	    while (scanner.hasNextLine()) {
	        String line = scanner.nextLine();
	        if (line.toLowerCase().contains(strEmployee.toLowerCase())) {
	            results.append(line).append("\n");
	            found = true;
	        }
	    }
	    scanner.close();

	    if (found) 
	    {
	        JOptionPane.showMessageDialog(null, results.toString());
	    } 
	    else {
	        JOptionPane.showMessageDialog(null, "Not Found");
	    }
	}
	
	// Searching for employees by role then displaying information
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException 
	{
	    File file = new File(fileLocation); // Creating File object for data file
	    Scanner scanner = new Scanner(file); // Creating scanner to read data from file
	    StringBuilder results = new StringBuilder(); // Creating string for lines in text file that match user input 
	    boolean found = false;

	    // Reading lines in txt file checking if role matches, then adds to results
	    while (scanner.hasNextLine()) {
	        String line = scanner.nextLine();
	        String[] parts = line.split(",");
	        if (parts.length > 2 && parts[2].trim().equalsIgnoreCase(strRole.trim())) {
	            results.append(line).append("\n");
	            found = true;
	        }
	    }
	    scanner.close();

	    if (found) {
	        JOptionPane.showMessageDialog(null, results.toString());
	    } else {
	        JOptionPane.showMessageDialog(null, "Not Found");
	    }
	}
	
	// Displaying distinct roles in file
	public void ViewRoles() throws FileNotFoundException {       
	    File myFile = new File(fileLocation); // Creating a File object for data file
	    Scanner inputFile = new Scanner(myFile); // Creating scanner to read data from file
	    Set<String> distinctRoles = new HashSet<>(); // Storeing roles that are unique 

	    // Reading each line extracts the role, and adds it to the set of distinct roles
	    while (inputFile.hasNextLine()) {
	        String strData2Show = inputFile.nextLine();
	        String[] dataParts = strData2Show.split(","); // Spliting by comma 
	        distinctRoles.add(dataParts[2]); // Role is the third element in the array (index 2)

	    }
	    inputFile.close();
	    String strRole = ""; // Displaying distinct roles
	    for (String role : distinctRoles) {
	        strRole += role + "\n"; //System.out.println(role);
	    }
	    
	    // Adding information about the average salary amount at the end
	    strRole += "\nNote: The average salary across all roles is " + averageSalary + "."; 
	    
	    JOptionPane.showMessageDialog(null, strRole);
	}

	public List<Employee> ReadAllEmployees() {
	    List<Employee> employees = new ArrayList<>(); // Storing list of Employee objects
	    try {
	        Scanner scanner = new Scanner(new File(fileLocation)); // Creating canner to read data from file
	       
	        // Reading  each line and creates an Employee object then adds to list
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            employees.add(new Employee(line));
	        }
	        scanner.close();
	    } catch (FileNotFoundException e) {
	        System.err.println("File not found: " + fileLocation); // Error message 
	    }
	    return employees; // Returning list of employees.
	}
}
