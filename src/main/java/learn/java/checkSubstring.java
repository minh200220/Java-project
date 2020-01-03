/*
 * Java project
 * Made by NQM  * 
 */
package learn.java;

import java.util.Scanner;

public class checkSubstring {
    private static boolean substring(String a, String b) {
        int n = a.indexOf(b);
        return (n != -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string a: ");
        String a = sc.nextLine();
        System.out.println("Enter string b: ");
        String b = sc.nextLine();
        if (substring(a, b)) 
            System.out.println("String b is in string a");
        else
            System.out.println("String b isn't in string a");
    }
}
