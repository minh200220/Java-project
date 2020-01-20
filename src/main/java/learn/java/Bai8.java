package learn.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Bai8 {
    public static int arr[];
    public static Scanner sc = new Scanner(System.in);
    
    public static void inputArr() {
        System.out.println("Nhap so phan tu: ");
	int n = sc.nextInt();
	arr = new int[n];
        
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Nhap vao pha tu thu " + (i+1));
		arr[i] = sc.nextInt();
	}
    }
    
    public static void Count() {
        System.out.println("Nhap so can dem: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i: arr) {
            if (i == x)
                count ++;
        }
        System.out.println("So lan xuat hien la: " + count);
    }
    
    public static void main(String[] args) {
	inputArr();
        Count();
	arrayElementCount();
    }
	
    public static void arrayElementCount()
    {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int i : arr) {
	    if(elementCountMap.containsKey(i)) {    
	        elementCountMap.put(i, elementCountMap.get(i)+1);
	    } else {
	        elementCountMap.put(i, 1);
	    }
        }
	         
        System.out.println("Mang da nhap : "+Arrays.toString(arr));
        System.out.println("Thong ke : "+elementCountMap);
    }
}

