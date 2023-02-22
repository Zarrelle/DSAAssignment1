/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zarrelle.dsaassignment1;

/**
 *
 * @author K00278911
 */
public class Student {
    private int id;
    private String fname;
    private String sname;
    private int age;
    private int english;
    private int irish;
    private int maths;
    private int science;
    private int geography;
    private int history;
    public Student(int newID, String newFname, String newSname, int newAge, int english, int irish, int maths, int science, int geography, int history){
        this.id = newID;
        this.fname = newFname;
        this.sname = newSname;
        this.age = newAge;
        this.english = english;
        this.irish = irish;
        this.maths = maths;
        this.science = science;
        this.geography = geography;
        this.history = history;
    }
    public Student(){
        
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public String getSname() {
        return sname;
    }
    public int getAge() {
        return age;
    }
    public int getEnglish() {
        return english;
    }
    public int getIrish() {
        return irish;
    }
    public int getMaths() {
        return maths;
    }
    public int getScience() {
        return science;
    }
    public int getGeography() {
        return geography;
    }
    public int getHistory() {
        return history;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public void setIrish(int irish) {
        this.irish = irish;
    }
    public void setMaths(int maths) {
        this.maths = maths;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public void setGeography(int geography) {
        this.geography = geography;
    }
    public void setHistory(int history) {
        this.history = history;
    }
    public String toString(){
        String output = "";
        output+= "(Student: ";
        output+= "ID: " + getId();
        output+= ", First Name: " + getFname();
        output+= ". Surname: " + getSname();
        output+= ". Age: " + getAge();
        output+= ", English: " + getEnglish();
        output+= ". Irish: " + getIrish();
        output+= ". Maths: " + getMaths();
        output+= ". Science: " + getScience();
        output+= ". Geography: " + getGeography();
        output+= ". History: " + getHistory();
        output+= ")";
        return output;
    }
}
