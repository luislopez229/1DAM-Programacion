/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen03;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca las horas");
        int horas = new Scanner(System.in).nextInt();
        System.out.println("Introduzca los minutos");
        int minutos = new Scanner(System.in).nextInt();
        System.out.println("Introduzca los segundos");
        int segundos = new Scanner(System.in).nextInt();
        
        int resultado = (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("En total hay: "+resultado+" segundos");
    
    }
    
}
