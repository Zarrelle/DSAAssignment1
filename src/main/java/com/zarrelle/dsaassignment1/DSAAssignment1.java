/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//package com.mycompany.dsaassignment1;
package com.zarrelle.dsaassignment1;

/**
 *
 * @author K00278911
 */
public class DSAAssignment1 {
    
    public static void main(String[] args) {
        MenuProcessor menu = new MenuProcessor();
        MenuGUI gui = new MenuGUI(menu);        
        
        gui.run();
    }
}
