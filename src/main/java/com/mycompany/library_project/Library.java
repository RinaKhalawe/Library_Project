/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

/**
 *
 * @author TTC
 */
public abstract class Library {
    
    private int id;
    private String name;
    private BirthDate bdate;

    public Library(int id, String name, BirthDate bDate) {
        this.id = id;
        this.name = name;
        this.bdate = bDate;
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

    public BirthDate getBdate() {
        return bdate;
    }

    public void setBdate(BirthDate bDate) {
        this.bdate = bDate;
    }

    
    public String getlibInfo() {
        return  "id=" + id + ", name=" + name + ", bdate=" + bdate ;
    }
    
    public abstract String getLoan();
    
}
