/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen05;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un número");
        int num = new Scanner(System.in).nextInt();
        
        num+=5;
        System.out.println("El número incrementado en 5: "+num);
        num-=4;
        System.out.println("El número decrementado en 4: "+num);
        num++;
        System.out.println("Incremento unitario: "+num);
        num--;
        System.out.println("Decremento unitario: "+num);
    }
    
}
