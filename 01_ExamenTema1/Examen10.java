/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen10;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el primer número");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca el segundo");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca el tercero");
        int num3 = new Scanner(System.in).nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El primero es el mayor");
        }
        
        if (num2 > num1 && num2 > num3){
            System.out.println("El segundo es el mayor");
        }
        
        if (num3 > num1 && num3 > num2){
            System.out.println("El tercero es el mayor");
        }
        
        if (num1 == num2 && num1 == num3){
            System.out.println("Los 3 números son iguales");
        }
    }
    
}
