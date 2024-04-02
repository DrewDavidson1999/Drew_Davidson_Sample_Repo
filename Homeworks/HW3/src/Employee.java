/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * Homework #3
 */

// Declaring private fields for employee attributes
public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;
    
    
    // Creating constructor to initialize employee object 
    public Employee(String line) 
    {
        String[] parts = line.split(","); // Splitting input line with commas
        // Assigning each part of the array to the corresponding employee attribute, with the order: Name, DateOfBirth, Role, EmployeeID, Email, Salary
        this.name = parts[0];
        this.setDateOfBirth(parts[1]);
        this.setRole(parts[2]);
        this.employeeId = Integer.parseInt(parts[3]);
        this.setEmail(parts[4]);
        this.salary = Double.parseDouble(parts[5]);
        this.aboveAvg = false; // set aboveAvg to false
        this.bar = SalaryBarChart(this.salary);
    }
    
    public void setAboveAvg(double dblAverage) // Setting aboveAvg = true if employee salary is greater then average salary

    {
        this.aboveAvg = this.salary > dblAverage; // Comparing salary with avg salary
        this.bar = SalaryBarChart(this.salary); // Updating bar chart based off salary 
    }
	
    public String SalaryBarChart(double salary) 
    {
        int stars = (int) salary / 10000; //Determining # of *'s
        StringBuilder bar = new StringBuilder(); // Creating Stringbuilder for stars 
        for (int i = 0; i < stars; i++) 
        {
            bar.append("*"); // Adding * for each 10,000 of salary 
        }
        return bar.toString(); 
    }
   
    // Formatting string for employee information 
    public String SummarizeEmployee() 
    {
        return "Name: " + this.name +
               ", Employee ID: " + this.employeeId +
               ", Salary Bar: " + this.bar +
               ", Above Average: " + (this.aboveAvg ? "Yes" : "No");
}

// Creating a getter and setter for each field 
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
	}
}
