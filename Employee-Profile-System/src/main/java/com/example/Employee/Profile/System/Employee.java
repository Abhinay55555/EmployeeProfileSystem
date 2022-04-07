package com.example.Employee.Profile.System;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    private long id;
    private String firstname;
    private String lastname;
    private float dateofbirth;
    private float dateofjoining;
    private String email;
    private int mobilenumber;
    private int salary;

    public Employee(){

    }

    public void Employee(long id, String firstname, String lastname, float dateofbirth, float dateofjoining, String email, int mobilenumber, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.dateofjoining = dateofjoining;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.salary = salary;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(float dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public float getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(float dateofjoining) {
        this.dateofjoining = dateofjoining;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
