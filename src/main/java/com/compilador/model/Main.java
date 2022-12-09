/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compilador.model;

import com.compilador.view.MainMenu;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gabriel.kresin
 */
public class Main {

    public static void main(String[] args) {
        do {
            System.out.println("Informe o número: ");
            Scanner scanner = new Scanner(System.in);
            String numero = scanner.nextLine();
            double convertIntFromString = convertFloatFromString(numero);
            System.out.println(convertIntFromString);
        } while (true);

//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
//            System.out.println("Erro ao carregar o tema");
//        }
//        MainMenu mainMenu = new MainMenu();
//        mainMenu.setVisible(true);
    }

    private static long convertLongFromString(String number) {
        if (number.contains("d")) {
            int index = number.indexOf("d");
            int n1 = Integer.parseInt(number.substring(0, index));
            int potenciador = Integer.parseInt(number.substring(index + 1, number.length()));
            Double n2 = Math.pow(10, potenciador);
            System.out.println(n2.intValue());
            return n1 * n2.longValue();
        } else {
            return Long.parseLong(number);
        }
    }

    private static double convertFloatFromString(String number) {
        if (number.contains(".") && number.contains("d")) {
            Integer indexPonto = number.indexOf(".");
            Integer indexD = number.indexOf("d");
            Integer n1 = 0;
            if (indexPonto != 0) {
                n1 = Integer.parseInt(number.substring(0, indexPonto));
            }
            Integer n2 = Integer.parseInt(number.substring(indexPonto + 1, indexD));
            Integer potenciador = Integer.parseInt(number.substring(indexD + 1, number.length()));

            String real = "";
            if (n1 == 0) {
                real = "0." + n2;
            } else {
                real = n1 + "." + n2;
            }

            Double parseFloat = Double.parseDouble(real);
            return parseFloat * Math.pow(10, potenciador);
        } else {
            return Double.parseDouble(number);
        }
    }

}
