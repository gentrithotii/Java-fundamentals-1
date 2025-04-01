package org.example.week14exercises.employee_managment;

import java.time.LocalDate;

public abstract class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;


    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculateSalary();
}
