/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compilador.model;

import com.compilador.view.MainMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gabriel.kresin
 */
public class Main {
    
    public static void main(String[] args) {

        String s = "fun main { \n" +
                    "\n" +
                    "var lado: int; \n" +
                    "\n" +
                    "readln (\"digite o lado do quadrado: , lado); \n" +
                    "area = lado * lado; \n" +
                    "print area); \n" +
                    "\n" +
                    "}";
        
        int errorPosition = 38 - 1;
        String[] lines = s.split("\\r?\\n|\\r");
        int actualPosition = 0;
        int line = 0;
        int errorLine = 1;
        for (String line1 : lines) {
            actualPosition += line1.length();
            if (actualPosition > errorPosition) {
                break;
            }
            errorLine ++;
        }
        
        System.out.println("Erro na linha " + (errorLine));
        
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
//            System.out.println("Erro ao carregar o tema");
//        }
//        MainMenu mainMenu = new MainMenu();
//        mainMenu.setVisible(true);
    }
    
}
