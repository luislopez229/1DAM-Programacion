/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen11;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el año");
        int anio = new Scanner(System.in).nextInt();
        
        if(anio % 400 == 0){
        System.out.println("Es bisiestro");
        }else{
        
        if ((anio % 4 == 0) && (anio % 100 != 0)){
        System.out.println("Es bisiestro");
        }else{
        System.out.println("No es bisiestro");
        }
        
        }
    }
    
}
