/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
4.4 (Geometry: Area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side). Write a program that prompts the user to enter the side of a hexagon and displays its area. Here is a sample run:
Due: Sep 29 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

import java.util.Scanner; // We are importing the Scanner class from java.util 

public class Main { // Open the class block
  
  public static void main(String[] args) { // Open the main method block

      // Create the Scanner Object scanner for grabbing the user input
      Scanner scanner = new Scanner(System.in);

      // Ask the user for the side length of the hexagon
      System.out.print("Enter the side length of the hexagon: ");

      // Grab the user input and store it in a variable
      double side = scanner.nextDouble();

      // Calculate the area using the formula
      double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
              // Math.pow calculates the power of a number
              // Math.tan calculates the tangent of an angle in radians
              // Math.PI represents the mathematical constant pi 
                                            // (approximately 3.14159)

      // Format the area to two decimal places
      String formattedArea = String.format("%.2f", area);
      
      // Print the area of the hexagon based on user input
      System.out.println("The area of the hexagon is: " + formattedArea);

  } // Close the main method block

} // Close the class block