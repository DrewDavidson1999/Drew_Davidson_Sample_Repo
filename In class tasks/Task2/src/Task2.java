import javax.swing.JOptionPane;

public class Task2 
{
	
	public static void main(String[] args)
	{
		String strName = JOptionPane.showInputDialog("Enter your Name"); // To hold the user's name 
		
		double dbAge = Double.parseDouble(JOptionPane.showInputDialog("Enter your age")); // To hold the user's age 
		
		String strCity = JOptionPane.showInputDialog("Enter your city"); //To hold the user's city 
		
		String strCollege = JOptionPane.showInputDialog("What college did you attend?"); // To hold the users college 
		
		String strProffesion = JOptionPane.showInputDialog("Enter your proffesion"); // To hold user's proffesion
		
		String strAnimalType = JOptionPane.showInputDialog("Enter your favorite type of animal"); // To hold users favoite animal
		
		String strPetName = JOptionPane.showInputDialog("Enter your pet or childhood pet's name"); 
		
		System.out.printf("There once was a person named %s who lived in %s. At the age of %f, %s went to college at %s. %s graduated and went to work as a %s. Then, %s adopted a(n) %s named %s. They both lived happily ever after!", strName, strCity, dbAge, strName, strCollege, strName, strProffesion, strName, strAnimalType, strPetName);
		
		
	}
}
	
