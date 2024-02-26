/** Author: [Drew Davidson]
 *  Class: MIST352-Spring24
 *  Homework #2
 *  This program allows a user to choose from four base juices, by providing options through a message dialog box. Then the program asks the user if they would like to add a ginger shot for an extra $1.00. The program also provides a discount when a user selects their base juice as Mango as well adds a ginger shot. Finally the program formulates a final bill based off the selected options, then based off the final price of the bill tax is added.  
 */ 

import javax.swing.JOptionPane; // Importing JOptionPane

public class HW2 {

	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Java Juice Bar!"); //Printing a message to the user 
		
		int intOption =Integer.parseInt(JOptionPane.showInputDialog(null, "Select your base juice: \n" + // Inserting message to user in dialog box asking them to select a base juice
				"1. Apple - $5.00 \n 2. Orange - $4.50 \n 3. Mango - $6.00 \n 4. Carrot - $5.50")); // Providing options for a base juice plus a price 
		
		double totalJuiceCost = 0.0;
		String baseJuiceName = "";
		
		switch(intOption) { // Creating a switch option for the 4 types of juices that the user can choose from 
		
		case(1):
			JOptionPane.showMessageDialog(null,"You selected Apple as your base juice."); // Message printing out that user selected Apple as their base juice. 
			totalJuiceCost = 5.00; // adding price of the base juice
			baseJuiceName = "Apple";
			break;
			
		
		case(2):
			JOptionPane.showMessageDialog(null,"You selected Orange as your base juice."); // Message printing out that user selected Orange as their base juice. 
			totalJuiceCost = 4.50; // adding price of the base juice 
			baseJuiceName = "Orange";
			break;
			
		case(3):
			JOptionPane.showMessageDialog(null,"You selected Mango as your base juice."); // Message printing out that user selected Mango as their base juice. 
			totalJuiceCost = 6.00; // adding price of the base juice
			baseJuiceName = "Mango";
			break;
		
		case(4):
			JOptionPane.showMessageDialog(null,"You selected Carrot as your base juice."); // Message printing out that user selected Carrot as their base juice. 
			totalJuiceCost = 5.50; // adding price of the base juice
			baseJuiceName = "Carrot";
			break;	
			
		default:
			JOptionPane.showMessageDialog(null, "Invalid selection. Please restart the program."); // Printing out a message telling user that they did not select an available option of base juice. 
			return;
		}
		
		double addOnPrice = 1.00; // Making the variable addOnPrice = $1.00, variable can store decimals 
        String ginger = "Ginger"; // Declaring a variable "ginger" to string type, assigning "Ginger" to the ginger variable
		
		int gingerOption = JOptionPane.showConfirmDialog(null, "Would you like to add ginger for an extra $1.00?", // Asking the user if they would like to add ginger for an extra $1.00
				"Ginger Option", JOptionPane.YES_NO_OPTION);
		
		if (gingerOption == JOptionPane.YES_OPTION) { // If the user selects "YES" in the confirm dialog box
			totalJuiceCost += 1.00; // Add $1.00 to the total cost of the bill  
			ginger = "Ginger"; 
		}
			
		JOptionPane.showMessageDialog(null, "Total cost: $" + totalJuiceCost);
		
		if (intOption == 3 && gingerOption == JOptionPane.YES_OPTION) { // If the user selects Mango as their base juice and adds ginger 
			totalJuiceCost -= 0.50; // Add a $0.50 discount from the total price 
		}
		
        double totalPrice = totalJuiceCost + addOnPrice; // total price of juice including addon option 
        double discount = (intOption == 3 && gingerOption == JOptionPane.YES_OPTION) ? 0.50 : 0.00; // Using a ternary operator, if statement is true $0.50 discount added, if not true nothing changes 
        double totalBeforeTax = totalPrice - discount; // calculating total before tax
        double tax = totalBeforeTax * 0.16; // TotalPreTax is multiplied by 0.16 to calculate tax 
        double totalAfterTax = totalBeforeTax + tax; // calculating total after tax 

        // Formating the Final Bill 
        String FinalBill = "| Final Bill |\n"
                + "-----------------------------\n"
                + "Base Juice: " + baseJuiceName + " - $" + String.format("%.2f", totalJuiceCost) + "\n"
                + "Add-On: " + ginger + " - $" + String.format("%.2f", addOnPrice) + "\n"
                + "-----------------------------\n"
                + "Full Price: $" + String.format("%.2f", totalPrice) + "\n"
                + "Discount: -$" + String.format("%.2f", discount) + "\n"
                + "-----------------------------\n"
                + "Total Before Tax: $" + String.format("%.2f", totalBeforeTax) + "\n"
                + "Tax: $" + String.format("%.2f", tax) + "\n"
                + "-----------------------------\n"
                + "Total After Tax: $" + String.format("%.2f", totalAfterTax);

        JOptionPane.showMessageDialog(null, FinalBill); // Displaying the final bill in a message dialog box 
		
	}
}
