/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen09;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un número entre 10 y 56");
        int num = new Scanner(System.in).nextInt();
        
        if(num >= 10 && num <= 56){
            System.out.println("Correcto");
        }else{
        System.out.println("Incorrecto");
        }
    }
    
}
