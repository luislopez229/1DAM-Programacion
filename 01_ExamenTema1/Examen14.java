/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen14;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el dinero");
        int dinero = new Scanner(System.in).nextInt();
        
        int resultado = dinero / 500;
        int res2 = dinero % 500;
        
        int res3 = res2 / 100;
        int res4 = res2 % 100;
        
        int res5 = res4 / 50;
        int res6 = res4 % 50;
        
        int res7 = res6 / 20;
        int res8 = res6 % 20;
        
        int res9 = res8 / 10;
        int res10 = res8 % 10;
        
        int res11 = res10 / 2;
        int res12 = res10 % 2;
        
        System.out.println("En billetes de 500: "+resultado);
        System.out.println("En billetes de 100: "+res3);
        System.out.println("En billetes de 50: "+res5);
        System.out.println("En billetes de 20: "+res7);
        System.out.println("En billetes de 10: "+res9);
        System.out.println("En billetes de 2: "+res11);
        System.out.println("En billetes de 1: "+res12);
    }
    
}
