//PROBLEM: Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e.  "x raised to the power of n".

import java.util.*;

public class Calculate_Power {
    
    // Function to calculate x raised to the power of n
    public static int calculatePower(int x, int n) {
        int result = 1;
        for(int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        // Calling the function and printing the result
        System.out.println(x + " raised to the power " + n + " is: " + calculatePower(x, n));

        sc.close();
    }   
}