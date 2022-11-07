/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen02;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Examen02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*********************");
        System.out.println("* Luis López Molina *");
        System.out.println("*********************");
        System.out.println("Introduzca una variable int");
        int varint = new Scanner(System.in).nextInt();
        System.out.println("Introduzca una variable double");
        double vardouble = new Scanner(System.in).nextDouble();
        System.out.println("Introduzca una variable float");
        float varfloat = new Scanner(System.in).nextFloat();
        System.out.println("Introduzca una variable long");
        long varlong = new Scanner(System.in).nextLong();
        System.out.println("Introduzca una variable booleana true o false");
        boolean varbool = new Scanner(System.in).nextBoolean();
        System.out.println("Varint: "+varint);
        System.out.println("Vardouble: "+vardouble);
        System.out.println("Varfloat: "+varfloat);
        System.out.println("Varlong: "+varlong);
        System.out.println("Varboolean: "+varbool);
    
    }
        
    
}
