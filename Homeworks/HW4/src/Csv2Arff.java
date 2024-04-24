import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class allows you to convert a csv file to arff file.
 * @authorMJ
 *
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location: The name 
	 */
	public Csv2Arff(String strFileLocation)
	{
		csvFileLocation=strFileLocation;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 */
	public void Convert2Arff(String theLocation) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(theLocation)); // Creating a buffered reader to read from the CSV file

            String line; // Variable holding each line from the file
            FileWriter arffWriter = new FileWriter(theLocation.replace(".csv", ".arff")); // Creating file writer to write to the ARFF file, chaning .csv to .arff 

            arffWriter.write("@relation CSV_Data\n\n"); // Writing ARFF header

            // Reading CSV file and writing ARFF attributes
            if ((line = csvReader.readLine()) != null) {
                String[] attributes = line.split(",");
                for (String attribute : attributes) {
                    arffWriter.write("@attribute " + attribute.trim() + " numeric\n");
                }
                arffWriter.write("\n@data\n");

                // Writing data 
                while ((line = csvReader.readLine()) != null) {
                    arffWriter.write(line + "\n");
                }
            }

            csvReader.close();
            arffWriter.close();
            System.out.println("ARFF file has been successfully created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	/**
	 * You need to code this
	 * This method should read the text file given in theFile, and store it into a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [row][column]
	 */
	public static String RetrieveCell(String theFile, int row, int column) 
	{
        String strData2Return = ""; // Initializing the return value as empty string
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(theFile));
            String line;
            int currentRow = 0; // Counter tracking current row 
            while ((line = csvReader.readLine()) != null) // Reading file until the correct row is reached
            {
                if (currentRow == row) 
                {
                    String[] data = line.split(","); // Spliting lines into columns
                    if (column >= 0 && column < data.length) // Checking if column is valid
                    {
                        strData2Return = data[column]; // Retrieving data from specific column
                        break;
                    }
                }
                currentRow++;
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strData2Return;
    }
	public void PrintMinMaxInfo(String strFile) {
        try {
            // Create a reader for the CSV file.
            BufferedReader csvReader = new BufferedReader(new FileReader(strFile));
            String line = csvReader.readLine(); // Read the first line containing column headers.
            if (line == null) {
                System.out.println("File is empty"); // Notify if the file is empty.
                return;
            }
            String[] columns = line.split(","); // Split the header to get column names.
            Map<String, Double> minValues = new HashMap<>(); // Map to store minimum values for each column.
            Map<String, Double> maxValues = new HashMap<>(); // Map to store maximum values for each column.

            // Initialize maps with extreme values.
            for (String column : columns) {
                minValues.put(column, Double.MAX_VALUE);
                maxValues.put(column, Double.MIN_VALUE);
            }

            // Read through the data lines.
            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(",");
                for (int i = 1; i < data.length; i++) { // Start from 1 to skip the name column.
                    double value = Double.parseDouble(data[i]); // Parse each value as a double.
                    String columnName = columns[i]; // Get the column name.
                    // Update the minimum and maximum values for each column.
                    if (value != 0 && value < minValues.get(columnName)) {
                        minValues.put(columnName, value);
                    }
                    if (value > maxValues.get(columnName)) {
                        maxValues.put(columnName, value);
                    }
                }
            }

            // Identify the columns with the overall minimum and maximum values.
            String minColumn = "";
            String maxColumn = "";
            double minValue = Double.MAX_VALUE;
            double maxValue = Double.MIN_VALUE;
            for (String column : columns) {
                if (minValues.get(column) < minValue) {
                    minValue = minValues.get(column);
                    minColumn = column;
                }
                if (maxValues.get(column) > maxValue) {
                    maxValue = maxValues.get(column);
                    maxColumn = column;
                }
            }

            // Print out the results.
            System.out.println("Name: " + strFile);
            System.out.println("Maximum non-zero value:");
            System.out.println("File name: " + csvFileLocation);
            System.out.println("Maximum Value: " + maxValue + " found in column: " + maxColumn);
            System.out.println("Minimum non-zero value:");
            System.out.println("File name: " + csvFileLocation);
            System.out.println("Minimum Value: " + minValue + " found in column: " + minColumn);

            csvReader.close(); // Close the reader.
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace in case of an IO error.
        }
    }
