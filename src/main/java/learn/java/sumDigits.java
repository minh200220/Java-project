/*
 * Java project
 * Made by NQM  * 
 */
package learn.java;

import java.util.Scanner;

public class sumDigits {
    private static int sum(int n) {
        int s = 0;
        while (n>0) {
            s += (n%10);
            n /= 10;
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("SumDigits of " + n + " is " + sum(n));
    }
}
