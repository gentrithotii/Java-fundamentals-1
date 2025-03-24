package org.example.Todo_Exercise;

import java.text.Format;
import java.text.MessageFormat;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void getLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName(){
        return getFirstName() +  " " +  getLastName();
    }

    public String getSummary() {
       return MessageFormat.format("Id: {0} ,name: {1}}, email: {2} ",getId(), getFullName(), getEmail());
    }
}
