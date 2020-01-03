/* Java project * Made by NQM */

package com.mycompany.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Student one = new Student("Minh", "B1809708", 20, 50f);
//        one.eat("Bread");
//        
        Student[] lst = new Student[1];
        while (true) {
            printMenu();
            option(lst);
        }
    }
    
    public static Student[] addStudent(Student arr[]) 
    {   
        // Create a new student
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new student's name: ");
        String name = sc.nextLine();
        System.out.println("Input new student's id: ");
        String id = sc.nextLine();
        System.out.println("Input new student's age: ");
        int age = sc.nextInt();
        System.out.println("Input new student's gpa: ");
        float gpa = sc.nextFloat();
        
        Student x = new Student(name, id, age, gpa);
        
        // create a new ArrayList 
        List<Student> arrlist = new ArrayList<>( Arrays.asList(arr)); 
  
        // Add the new element 
        arrlist.add(x); 
  
        // Convert the Arraylist to array 
        arr = arrlist.toArray(arr); 
  
        // return the array 
        return arr; 
    } 
    
    private static void printMenu() {
        System.out.println("/************************************/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
    }
    
    private static void option(Student[] lst) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice: ");
        int value = sc.nextInt();
        switch(value) {
            case 1:
                addStudent(lst);
                break;
            case 2:
//                editStudent();
                break;
            case 3:
//                deleteStudent();
                break;
            case 4:
//                sortByGpa();
                break;
            case 5:
//                sortByName();
                break;
            case 6:
//                showStudent();
                break;
            case 0:
//                exit();
                break;    
        }
    }
}
