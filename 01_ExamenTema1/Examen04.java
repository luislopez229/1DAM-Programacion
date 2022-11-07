/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen04;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduzca la primera edad");
        int edad1 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca la segunda edad");
        int edad2 = new Scanner(System.in).nextInt();
        
        boolean mayor1 = edad1 >= 18;
        boolean mayor2 = edad2 >= 18;
        
        boolean mayorque = edad1 > edad2;
        
        System.out.println("¿La primera persona es mayor de edad?: "+mayor1);
        System.out.println("¿La segunda persona es mayor de edad?: "+mayor2);
        System.out.println("¿La primera persona es mayor que la segunda20?: "+mayorque);
    
    }      
    
    
}
