
package learn.java;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4};
        Scanner scan = new Scanner(System.in);
        String arrayOfNames[] = new String[4];
            for (int i = 0; i < arrayOfNames.length; i++) {
		System.out.print("Enter the name of friend " + (i+1) + " : ");
	        arrayOfNames[i] = scan.nextLine();
            }
    }
}
