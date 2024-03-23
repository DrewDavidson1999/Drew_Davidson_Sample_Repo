/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #7
 * This code initializes three employees with different details and then calls a method to display each employee's information.
 */

package Task7;


public class Task7 {
    public void Employee(String string, int i, String string2, String string3) //defining a constructor method named "Employee" with four parameters
    {
	
    }

	public static void main(String[] args) {
        // Create three Employee objects
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President"); // Creating Employee Susan
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer"); // Creating Employee Mark
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer"); // Creating Employee Joy

        // Display employee information for each employee
        susan.displayEmployeeInfo(); // Displaying Employee information for Susan
        mark.displayEmployeeInfo(); // Displaying Employee information for Mark
        joy.displayEmployeeInfo(); // Displaying Employee information for Joy
    }

	void displayEmployeeInfo() // Displaying Employee info
	{ 
		
	}
}