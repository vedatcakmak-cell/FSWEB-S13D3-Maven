package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    boolean gender; // return true when its female
    double height;
    double weight;

    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName =lastName;
        this.age= age;
    }
    public Person(String firstname, String lastName, int age, boolean gender, double height, double weight){
        this(firstname,lastName,age);
        this.gender=gender;
        this.height=height;
        this.weight=weight;
    }
    public String getFirstName(){
        return firstname;
    }
    public  String getLastName(){
        return  lastName;
    }
    public  int getAge(){
        return age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
}
