/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

/**
 *
 * @author TTC
 */
public class Person {
   
    private int id;
    private String name;
    private BirthDate bDate;
    private String address;

    public Person(int id, String name, BirthDate bDate, String address) {
        this.id = id;
        this.name = name;
        this.bDate = bDate;
        this.address = address;
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

    public BirthDate getbDate() {
        return bDate;
    }

    public void setbDate(BirthDate bDate) {
        this.bDate = bDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
