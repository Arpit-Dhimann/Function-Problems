//PROBLEM: Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Greater_Number {
    
    // Function that takes 2 numbers and returns the greater one
    public static int getGreater(int a, int b) {

        if(a > b) {
            return a;
        } 
        else {
            return b;
        }
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        
        // Calling the function and printing the result
        System.out.println("The greater number is: " + getGreater(a, b));

        sc.close();
    }   
}