/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zarrelle.dsaassignment1;

/**
 *
 * @author K00278911
 */
public class HomebrewStack {
    private Node top;
    private int sSize;
    public HomebrewStack() {
        top = null;
        sSize = 0;
    }
    public int size(){
        return sSize;
    }
    public boolean isEmpty(){
        return (top == null);
    }
    public Student top(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }
        return top.getElement();
    }
    public Node topNode(){
        return top;
    }
    public void push(Student thing){
        Node newNode = new Node(thing, top);
        top = newNode;
        sSize++;
    }
    public Student pop(){
        Student temp;
        if(isEmpty()){
            System.out.println("Stack is empty.");
        } 
        temp = top.getElement();
        top = top.getNext();
        sSize--;
        return temp;
    }
}
