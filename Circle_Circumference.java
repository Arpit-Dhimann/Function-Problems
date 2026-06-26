//PROBLEM: Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class Circle_Circumference {
    
    // Function to calculate the circumference of a circle
    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        
        // Input radius
        double r = sc.nextDouble(); 
        
        // Calling the function using variable 'r'
        System.out.println("Circumference is: " + getCircumference(r));

        sc.close();
    }   
}