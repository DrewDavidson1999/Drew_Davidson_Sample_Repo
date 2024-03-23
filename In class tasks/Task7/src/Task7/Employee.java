/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #7
 * The code creates a model for employees, using their essential information displaying the data in a dialog box.
 */


package Task7;
import javax.swing.JOptionPane; // Importing JoptionPane


public class Employee {
	
	// Declaring four private instance variables in the Employee class.
    private String name; 
    private int idNumber;  
    private String department; 
    private String position; 

    // Creating constructor method with no parameters
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    // Creating a constructor with four parameters 
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Initializes Employee object with provided name and ID number, while leaving the department and position empty.
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    // Displaying employee information in JOptionPane dialog
    public void displayEmployeeInfo() {
        String message = "Employee " + name + " has the ID " + idNumber + " and works as a " +
                position + " in the " + department + " department.";
        JOptionPane.showMessageDialog(null, message, "Employee Information", JOptionPane.INFORMATION_MESSAGE);
    }

    // Creating setter methods that allow values to bet set for the name, idNumber, department, and position instance variables.
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Creating getter methods that allow accessing the values of instance varaibles. 
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}