/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

/**
 *
 * @author TTC
 */
public class Students extends Person {
    private String major;

    public Students(int id, String name, BirthDate bDate, String address,String major) {
        super(id, name, bDate, address);
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
    
}
