package com.mycompany.java;

public class Student extends Person{
    public String id;
    public float gpa;

    // overridedConstructor
    public Student(String name, String id, int age, float gpa) {
        super(name, age);
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }
    
    public void eat(String food) {
        super.eat();
        System.out.println(food + " is delicious!");
    }
    
    // overrideMethod
    @Override
    public void printInfo() {
        System.out.println("=====================");
        System.out.println("Name: \t" + this.name);
        System.out.println("Id:   \t" + this.id);
        System.out.println("Age:  \t" + this.age);
        System.out.println("GPA:  \t" + this.gpa);
    } 
}
