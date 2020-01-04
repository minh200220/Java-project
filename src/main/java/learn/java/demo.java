
package learn.java;

//import java.util.Scanner;

import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        getOption();
    }
    
    public static int getOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice [0-6]: ");
        int value = sc.nextInt();
        System.out.println(value);
        return value;
    }
}
