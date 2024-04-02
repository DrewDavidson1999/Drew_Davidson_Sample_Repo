/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * Homework #3
 * This is the main method class of the program. The HW3 class is used for viewing employee IDs, searching for employees by name or role, displaying current roles, viewing average salaries, and summarizing employee data to write to a file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HW3 {
    public static void main(String[] args) throws FileNotFoundException {
        String strDataLocation = "src/EmployeeData.txt"; // Setting variable strDataLocation as the path to text file
        String strOutputLocation = "src/EmployeeSummary.txt"; // Setting variable strOutputLocation as the path to textfile
        File myFile = new File(strDataLocation); // Creating a file object for reading
        Scanner inputFile = new Scanner(myFile); // Creating scanner to read EmployeeData.txt
        PrintWriter writer = new PrintWriter(strOutputLocation); // Creating a print writer to write to the EmployeeSummary.txt
        int intChoice = Integer.parseInt(JOptionPane.showInputDialog(null, ViewOptions())); // Show options dialog and parse choice to int

        DataSummary myData = new DataSummary(strDataLocation); // Creating an object to handle employee data.

        
        while (intChoice != 0) // Loop until option 0 is chosen
        { 
            switch (intChoice) 
            {
            case 1:
                myData.ViewEmployeeAndIDs(); // View employee IDs.
                break;
            
            case 2:
                String searchName = JOptionPane.showInputDialog("Enter employee name to search for:"); // Input dialog box asking user for employee name
                myData.SearchEmployee(searchName); // Search and display employee by name based off user input
                break;
            
            case 3:
                myData.ViewRoles(); // Displaying roles
                break;
            
            case 4:
                String role = JOptionPane.showInputDialog("Enter role to search for:"); // Input dialog box asking user to enter role their are looking for
                myData.ViewEmployeeForRole(role); // Search and display roles
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "The average salary is: " + myData.getAverage()); // Displaying avg salary
                break;
            
            case 6:
                List<Employee> employees = myData.ReadAllEmployees(); // Read all employee data and turn into list
                for (Employee emp : employees) 
                { 
                    writer.println(emp.SummarizeEmployee()); // Writing summary to file 
                }
                JOptionPane.showMessageDialog(null, "Data summary written to " + strOutputLocation); // Creating a confirmation dialog box, saying where the output is located 
                writer.flush(); // Making sure that all data is written to the file.
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong Option"); // If user input is not 0-6 print "Wrong Option" 
                break;
            }
            intChoice = Integer.parseInt(JOptionPane.showInputDialog(null, ViewOptions())); // Redisplaying menu for a new choice 
        }
        writer.close(); // Closing Printwriter 
        inputFile.close(); // Closing scanner
    }
    
    public static String ViewOptions()
    {
        String strMessageToDisplay="Choose an option:"
                + "\n0.\tExit"
                + "\n1.\tView Employees and IDs"
                + "\n2.\tSearch for Employee"
                + "\n3.\tView current roles"
                + "\n4.\tView employees for a certain role"
                + "\n5.\tView Average Salary"
                + "\n6.\tSummarize and Write data";
        return strMessageToDisplay;
    } 
}