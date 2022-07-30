package com.my_learnings.exercises;

class Employee {
    private int id;
    private String name;

    public Employee() {
        /* Empty Constructor. */ }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class OopExercise {
    public static void main(String[] args) {
        Employee harry = new Employee(1, "Haris Khan");
        System.out.println(harry.getName()); 
        System.out.println(harry.getId()); 
    }
}
