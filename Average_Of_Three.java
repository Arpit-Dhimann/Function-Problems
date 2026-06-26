//PROBLEM: Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Average_Of_Three {
    
    // Function to calculate and print the average of three numbers
    public static void printAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average of the three numbers is: " + average);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs from the user
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        System.out.print("Enter number c: ");
        int c = sc.nextInt();

        // Calling the function to print the average
        printAverage(a, b, c);

        sc.close();
    }   
}