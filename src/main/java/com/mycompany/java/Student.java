package com.mycompany.java;

public class Student{
    private String name;
    private String id;
    private int age;
    private float gpa;

    // overridedConstructor
    public Student(String name, String id, int age, float gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public void printInfo() {
        System.out.println("=====================");
        System.out.println("Name: \t\t" + this.name);
        System.out.println("Id:   \t\t" + this.id);
        System.out.println("Age:  \t\t" + this.age);
        System.out.println("GPA:  \t\t" + this.gpa);
    } 
}
