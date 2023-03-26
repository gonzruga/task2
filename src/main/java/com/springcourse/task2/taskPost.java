package com.springcourse.task2;

public class taskPost {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

 public String returnFullName(){

     return "Full Name: " +this.firstName+ " " +this.lastName;
 }

}
