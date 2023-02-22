/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zarrelle.dsaassignment1;

import java.util.Scanner;

/**
 *
 * @author K00278911
 */
public class MenuProcessor {
    private HomebrewStack stack;
    private Student student;
    public MenuProcessor(){
        //Create the stack object for Menu to se
        stack = new HomebrewStack();
        //Populate stack with sample data
        student = new Student(65513, "Bob", "MacPlaceholder", 32, 70, 71, 82, 63, 95, 95);
        stack.push(student);
        student = new Student(96854, "John", "Doe", 37, 54, 35, 95 ,65 ,45, 15);
        stack.push(student);
        student = new Student(32168, "Jim", "Jangles", 19, 78, 98, 54 ,45 ,65, 12);
        stack.push(student);
        student = new Student(48651, "Bob", "MacPlaceholder", 28, 48, 95, 26 ,39, 71, 79);
        stack.push(student);
        student = new Student(23568, "Top-Marks", "ButOffByOne", 26, 99, 99, 99, 99, 99, 99);
        stack.push(student);
        student = new Student(93685, "Definitely", "McNotgraduating", 27, 01, 12, 11, 31, 04, 07);
        stack.push(student);
        student = new Student(85961, "Compensating", "fail", 61, 40, 40, 40, 40, 40, 40);
        stack.push(student);
        student = new Student(37187, "Perfectly", "Average", 22, 50, 50, 50, 50, 50, 50);
        stack.push(student);
        student = new Student(64861, "Never-even", "Attended", 24, 65, 45, 41, 87, 95, 76);
        stack.push(student);
        student = new Student(98765, "Ecin", "McNiceame", 29, 96, 96, 96, 96, 96, 96);
        stack.push(student);
    }
    public void CheckForEmptyStack(){
        String output = "";
        if(stack.isEmpty()){
            output+= "Stack is currently empty.";
        } else {
            output+= "Stack is currently not empty.";
        }
        System.out.println(output);
    }
    public void InsertData(){
        Scanner in = new Scanner(System.in);
        String input = "";
        Student student = new Student();
        
        boolean validID = false;
        while(!validID){
            System.out.print("Enter student ID: ");
            input = in.nextLine();
            int temp = Integer.parseInt(input);
            if(temp <= 10000 && 99999 <= temp){
                System.out.print("That's not a 5 digit number.");
            } else {
                validID = true;
            }
        }
        
        student.setId(Integer.parseInt(input));
        
        System.out.print("Enter student First Name: ");
        input = in.nextLine();
        student.setFname(input);
        
        System.out.print("Enter student Second Name: ");
        input = in.nextLine();
        student.setSname(input);
        
        System.out.print("Enter student Age: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter english results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter irish results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter maths results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter science results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter geopraphy results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        System.out.print("Enter history results: ");
        input = in.nextLine();
        student.setAge(Integer.parseInt(input));
        
        stack.push(student);
        
        System.out.println("\nData inserted.");
    }
    public void RemoveTop(){
        stack.pop();
        System.out.println("\nData Removed from top.");
    }
    public void ReportTop(){
        Student topStudent = stack.top();
        System.out.println(topStudent.toString());
    }
    public void ReportSize(){
        System.out.println("\n"+stack.size());
    }
    public void ClearStack(){
        while(!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("Stack cleared.");
    }
    public void SearchStack(){
        Scanner in = new Scanner(System.in);
        Node tempNode = stack.topNode();
        Student tempStudent;
        
        System.out.println("Enter student's surname");
        String input = in.nextLine();
        while(tempNode != null){
            tempStudent = tempNode.getElement();
            if(tempStudent.getSname().equals(input)){
                System.out.println(tempStudent.toString());
            }
            tempNode = tempNode.getNext();
        }
    }
    public void PrintStack(){
        Node tempNode = stack.topNode();
        Student tempStudent;
        while(tempNode != null){
            tempStudent = tempNode.getElement();
            System.out.println(tempStudent.toString());
            tempNode = tempNode.getNext();
        }
    }
}
