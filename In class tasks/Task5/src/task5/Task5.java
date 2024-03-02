/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #4
 * This program 
 */

package task5; // Declaring package 

import java.util.Scanner; // Importing scanner 

public class Task5 {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in); // Initializing scanner named keyboard
        // Ask for the number of floors
        System.out.print("How many floors does the hotel have? "); // Printing out message to user 
        int hotelFloors = keyboard.nextInt(); // Accepting user input using scanner for number of floors in hotel

        while (hotelFloors < 1) // Creating a while loop, if hotelFloors < 1 is true, loop repeats.
        { 
            System.out.println("Invalid input, the number of floors must be greater or equal to 1."); // Printing out message to user, if user inputs invalid number
            hotelFloors = keyboard.nextInt(); 
        }

        int totalRooms = 0; // Declaring integer named totalRooms
        int totalOccupiedRooms = 0; // Declaring integer named totalOccupiedRooms 

        for (int floor = 1; floor <= hotelFloors; floor++) // Creating a for loop, initializing floor = 1, number of floor + 1 for each iteration 
        {
            System.out.print("How many rooms does floor " + floor + " have? : "); // Printing out message to user asking for input, using floor variable for current floor
            int numRooms = keyboard.nextInt(); // Accepting user input through scanner, storing input in variable numRooms

            // Validate input for number of rooms on a floor
            while (numRooms < 10) // Creating another while loop for numRooms with a condition, if numRooms less than 10
            {
                System.out.println("Invalid input. Enter 10 or more."); // Printing message to user if input is less than 10 
                System.out.print("How many rooms does floor " + floor + " have? "); 
                numRooms = keyboard.nextInt(); // Accepting user input for numRooms
            }

            totalRooms += numRooms; // adding numRooms to totalRooms

            System.out.print("How many occupied rooms does floor " + floor + " have? "); // Printing message to user asking how many rooms are occupied on current floor
            int occupiedRooms = keyboard.nextInt(); // Accepting user input through scanner, storing input in variable occupiedRooms

            while (occupiedRooms < 0 || occupiedRooms > numRooms) // Creating a while loop using an or operator, if both conditions are true while loop will execute 
            {
                System.out.println("Invalid. Enter 10 or more."); // Printing out message to user if while loop conditions are not true 
                System.out.print("How many occupied rooms does floor " + floor + " have? ");
                occupiedRooms = keyboard.nextInt(); // Accepting user input for occupiedRooms
            }

            totalOccupiedRooms += occupiedRooms; // Adding occupiedRooms to totalOccupiedRooms
        }

        int vacantRooms = totalRooms - totalOccupiedRooms; // Declaring a new variable vacantRooms, vacantRooms = totalRooms - totalOccupiedRooms

        double occupancyRate; // Declare a variable named occupancyRate
        
            occupancyRate = totalOccupiedRooms * 100.0 / totalRooms; // Calculate occupancy rate, by totalOccupiedRooms * 100 / totalRooms
      
        // Display the results
        System.out.println("Number of rooms: " + totalRooms); // Printing message to user for totalRooms + value stored in totalRooms variable
        System.out.println("Occupied rooms: " + totalOccupiedRooms); // Printing message to user for totalOccupiedRooms + value stored in totalOccupiedRooms variable
        System.out.println("Vacant rooms: " + vacantRooms); // Printing message to user for vacantRooms + value stored in vacantRooms variable
        System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate); // Printing message to user for occupancyRate + value stored in occupancyRate variable

        keyboard.close(); // Closing scanner
    }
}