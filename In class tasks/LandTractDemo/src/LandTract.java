/* Author [Drew Davidson]
 * Class: MIST352-Spring24
 * In Class Task #8
 * LandTract.java defines a data model for a land tract, including methods to compute the area of the land tract and to compare different land tracts based on their areas
 */

public class LandTract {
    private double length; // Field storing the length of the land tract
    private double width; // Field storing the width of the land tract

    public LandTract(double len, double w) 
    {
        this.length = len; // Assigning passed length to the length field
        this.width = w; // Assigning passed width to the width field
    }

    public double getArea() 
    {
        return length * width; // Multipling length by width to calculate the area then returning it 
    }

    public boolean equals(LandTract tract2) // Determining if land tract is equal in area to another land tract
    {
        return this.getArea() == tract2.getArea(); // Comparing area of tract 1 with tract 2's area
    }

    public String toString() 
    {
        return "Length: " + length + ", Width: " + width + ", Area: " + getArea(); // Constructing a string with length, width, and area of the tract
    }
}