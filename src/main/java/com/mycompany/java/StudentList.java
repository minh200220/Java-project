package com.mycompany.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static List<Student> list = new ArrayList<Student>();
    public static Scanner sc = new Scanner(System.in);
    
    public static void addStudent() {   
        // Create a new student
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
    } 
    
    public static void editStudent() {
        System.out.println("Enter id to edit: ");
        String id = sc.nextLine();

        for (Student e : list) {
            if (id.equals(e.id)) {
                System.out.println("Input new name: ");
                e.name = sc.nextLine();
                System.out.println("Input new age: ");
                e.age = sc.nextInt();
                System.out.println("Input new gpa: ");
                e.gpa = sc.nextFloat();
            }
        }
        System.out.println("Edited " + id);
    }
    
    public static void deleteStudent() {
        System.out.println("Enter id to delete: ");
        String id = sc.nextLine();
        
        for (Student e : list) {
            if (id.equals(e.id)) {
                int pos = list.indexOf(e);
                list.remove(pos);
            }
        }
    }
    
    public static void sortByGpa() {
        System.out.println("Sorting students by gpa...");
    }
    
    public static void sortByName() {
        System.out.println("Sorting students by name...");
    }
    
    public static void showStudent() {
        System.out.println("Showing the students...");
        list.forEach((a) -> {
            a.printInfo();
        });
    }
    
    public static void printMenu() {
        System.out.println("============ STUDENT MANAGER ============");
        System.out.println("1. Add student\n2. Edit student by id\n3. Delete student by id");
        System.out.println("4. Sort student by gpa\n5. Sort student by name\n6. Show student.\n0. Exit.");
    }
    
    public static void option() {
        System.out.println("Your choice [0-6]: ");
        int value = sc.nextInt();
        sc.nextLine();
        switch(value) {
            case 1:
                addStudent();
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
