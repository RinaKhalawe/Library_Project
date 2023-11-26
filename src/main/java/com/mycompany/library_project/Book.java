/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_project;

/**
 *
 * @author TTC
 */
public class Book extends Library implements Display {
    
    private Author author ;
    private String genre;
    private String version;

    public Book(int id,  String name, BirthDate bDate, Author author, String genre, String version) {
        super(id, name, bDate);
        this.author = author;
        this.genre = genre;
        this.version = version;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    @Override
    public boolean inLoan(){
        return true;
    }

    @Override
    public String getInfo() {
        return "Book Info {" +super.getlibInfo() +  "author=" + author + ", genre=" + genre + ", version=" + version + '}';
    }
    @Override
     public String getLoan(){
         return "loan Books are :" + super.getName() ;
     }
}
