/* Java project * Made by NQM */

package com.mycompany.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static List<Student> list = new ArrayList<Student>();
    public static void main(String[] args) {  
        while (true) {
            printMenu();
            option();
        }
    }
    
    public static List<Student> addStudent() {   
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
        list.add(x);
        
        return list;
    } 
    
    private static void showStudent() {
        System.out.println("Showing the students...");
//        list.forEach((a) -> {
//            a.printInfo();
//        });
    }
    
    private static void editStudent() {
        System.out.println("Editing students...");
    }
    
    private static void deleteStudent() {
        System.out.println("Deleting students...");
    }
    
    private static void sortByGpa() {
        System.out.println("Sorting students by gpa...");
    }
    
    private static void sortByName() {
        System.out.println("Sorting students by name...");
    }
    
    private static void printMenu() {
        System.out.println("/============ STUDENT MANAGER ============/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
    }
    
    private static void option() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice [0-6]: ");
        int value = sc.nextInt();
        switch(value) {
            case 1:
                list = addStudent();
                break;
            case 2:
                editStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                sortByGpa();
                break;
            case 5:
                sortByName();
                break;
            case 6:
                showStudent();
                break;
            case 0:
            default:
                System.exit(0); 
                break;    
        }
    }
}
