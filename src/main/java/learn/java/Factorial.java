/*
 * Java project
 * Made by NQM  * 
 */
package learn.java;

import java.util.Scanner;

public class Factorial {
    private static int factorial(int n) {
        if (n == 0) 
            return 1;
        else
            return n * factorial(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
