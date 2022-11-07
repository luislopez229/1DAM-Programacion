/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen12;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduzca la edad");
        int edad = new Scanner(System.in).nextInt();
        
      String resultado = edad>=18 ?  "Es mayor de edad":"No es mayor de edad";
      System.out.println(resultado);
    
    }
    
}
