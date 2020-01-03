package com.mycompany.java;

public class Person {
    public String name;
    public int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }
    
    public void eat() {
        System.out.println("Eating...");
    }
}
