/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen07;

/**
 *
 * @author luis
 */
public class Examen07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1="123";
        String n2="69";
        
        int intn1 = Integer.parseInt(n1);
        int intn2 = Integer.parseInt(n2);
        
        System.out.println("Suma: "+(intn1+intn2));
        System.out.println("Producto: "+(intn1*intn2));
        System.out.println("División: "+(intn1/intn2));
        System.out.println("Multiplicación: "+(intn1*intn2));
        System.out.println("Resto: "+(intn1%intn2));
    }
    
}
