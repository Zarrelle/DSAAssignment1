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
public class MenuGUI {
    public MenuProcessor menu;
    public MenuGUI(MenuProcessor menu){
        this.menu = menu;
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        String inputOption = "";
        String display = 
        "//////////////////////////////////////////////////////////////////////////////////////////\n"
                + "Data Structures and Algorithms Assignmen 1\n"
                + "\n"
                + "MENU OPTIONS:\n"
                + "1:\tCheck for Empty Stack.\n"
                + "2:\tInsert Data at Top of Stack.\n"
                + "3:\tRemove Data frmo Top of Stack.\n"
                + "4:\tReport Data Currently at Top of Stack.\n"
                + "5:\tReport Current Number of Items in Stack.\n"
                + "6:\tClear All Data from the Stack.\n"
                + "7:\tSeartch the Stack for a Particular Student by Surname and Report Back the Result.\n"
                + "8:\tPrint the Contents of the Stack.\n"
                + "9:\tExit Program.\n"
                + "\n"
                + "Please enter a menu option: ";
        System.out.print(display);
        while(!stop){
            inputOption = input.nextLine();
            
            switch (inputOption){
                case "1" -> menu.CheckForEmptyStack();
                case "2" -> menu.InsertData();
                case "3" -> menu.RemoveTop();
                case "4" -> menu.ReportTop();
                case "5" -> menu.ReportSize();
                case "6" -> menu.ClearStack();
                case "7" -> menu.SearchStack();
                case "8" -> menu.PrintStack();
                case "9" -> stop = true;
            }
            
            
        }
    }
}
