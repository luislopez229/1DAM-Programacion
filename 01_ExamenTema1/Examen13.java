/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen13;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el radio");
        double radio = new Scanner(System.in).nextDouble();
         
        final double pi = 3.1416;
        double resultado = pi * (pow(radio,2));
        
        System.out.println("Área del círculo: "+resultado);
    }
    
}
