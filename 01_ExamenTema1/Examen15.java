/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen15;

/**
 *
 * @author luis
 */
public class Examen15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x = true;
        boolean y = false;
        boolean z = true;
        
        boolean res1 = x || y || x && !z && !y;
        boolean res2 = (x || !y) && (!x || z);
        boolean res3 = !x || !y || z && x && !y;
        
        System.out.println("Resultado 1: "+res1);
        System.out.println("Resultado 2: "+res2);
        System.out.println("Resultado 3: "+res3);
    }
    
}
