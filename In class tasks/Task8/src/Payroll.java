/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #8
 * This class holds payroll data and operations for employees. Including methods to calculate gross pay,
 * set and get employee hours, pay rates, and IDs
 */


public class Payroll 
{
	static final int NUM_EMPLOYEES = 7; // Declaring and initializing a constant for number of employees
	
	private int[] EmployeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489}; // Array used to store employee IDs
	
	private int [] hours = new int [NUM_EMPLOYEES]; // Array used to store hours worked for each employee
	
	private double[] payRate = new double[NUM_EMPLOYEES]; // Array used to store hourly pay rate for each employee
	
	private double[] wages = new double[NUM_EMPLOYEES]; // Array used to store wages for each employee
	
	public double calculateGrossPay(int i) // Calculate gross pay for an employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) // Validating index
		{ 
			double grossPay = hours[i] * payRate[i]; // Calculating gross pay
			return grossPay; // Returnig calculated gross pay
		}
		return i; 
	}
	
	public void setEmployeeID(int i, int id) // Method setting employee ID
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			EmployeeID[i] = id; 
		}
	}

	public void setHoursWorked(int i, int h) // Method setting hours worked for a employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			hours[i] = h; 
		}
	}
	
	public void sethourlyRate(int i, double p) // Method setting hourly pay rate for a employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			payRate[i] = p; 
		}
	}
	
	public void setWagesEarned(int i, double w) // Method setting wages earned by a employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			wages[i] = w; 
		}
	}

	public int getEmployeeID(int i) // Method getting a employee ID
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			return EmployeeID[i]; 
		}
		return i; 
	}
	
	public int getHoursWorked(int i) // Method getting hours worked by a employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			return hours[i]; 
		}
		return i; 
	}
	
	public double getPayRate(int i) // Method getting hourly pay rate of a employee
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			return payRate[i]; 
		}
		return i; 
	}
	
	public double getWagesEarned(int i) // Method getting wages earned by a employee 
	{
		if (i >= 0 && i < NUM_EMPLOYEES) 
		{
			return wages[i]; 
		}
		return i; 
	}
}