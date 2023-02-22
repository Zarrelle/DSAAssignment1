/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zarrelle.dsaassignment1;

/**
 *
 * @author K00278911
 */
public class Node {
    private Student element;
    private Node next;
    public Node(Student element, Node next){
        this.element = element;
        this.next = next;
    }
    public Student getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(Student element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
