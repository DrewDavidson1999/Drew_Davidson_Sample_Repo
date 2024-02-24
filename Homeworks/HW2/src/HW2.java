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
		
		double addOnPrice = 1.00;
        String ginger = "";
		
        Object[] options = {"YES", "NO"};
		int gingerOption = JOptionPane.showOptionDialog(null, "Would you like to add ginger for an extra $1.00?", // Asking the user if they would like to add ginger for an extra $1.00
				"Ginger Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (gingerOption == JOptionPane.YES_OPTION) { // If the user selects "YES" in the confirm dialog box
			totalJuiceCost += 1.00; // add 
			ginger = "Ginger";
		}
			
		JOptionPane.showMessageDialog(null, "Total cost: $" + totalJuiceCost);
		
		if (intOption == 3 && gingerOption == JOptionPane.YES_OPTION) { // If the user selects Mango as their base juice and adds ginger 
			totalJuiceCost -= 0.50; // Apply a $0.50 discount 
		}
		
        double fullPrice = totalJuiceCost + addOnPrice; // Calculate the full price
        double discount = (intOption == 3 && gingerOption == JOptionPane.YES_OPTION) ? 0.50 : 0.00; // Calculate the discount
        double totalBeforeTax = fullPrice - discount; // Calculate the total before tax
        double tax = totalBeforeTax * 0.16; // Calculate the tax
        double totalAfterTax = totalBeforeTax + tax; // Calculate the total after tax

        // Format the final bill message
        String FinalBill = String.format("I Final Bill I\n"+ "-----------------------------\n"+ "Base Juice: %s - $%.2f\n"+ "Add-On: %s - $%.2f\n"+ "-----------------------------\n"
                + "Full Price: $%.2f\n"+ "Discount: -$%.2f\n"+ "-----------------------------\n"+ "Total Before Tax: $%.2f\n"+ "Tax: $%.2f\n"+ "-----------------------------\n"
                + "Total After Tax: $%.2f", baseJuiceName, totalJuiceCost, ginger, addOnPrice, fullPrice, discount, totalBeforeTax, tax, totalAfterTax);

        JOptionPane.showMessageDialog(null, FinalBill); // Display the formatted final bill
		
	}
}
