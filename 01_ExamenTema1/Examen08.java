/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen08;

/**
 *
 * @author luis
 */
public class Examen08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] vocales={'a','e','i','o','u'};
        double [] decimales={1.1,2.2,3.3,4.4,5.5};
        String [] lenguajes={"Java","C++","Python"};
        
        lenguajes[0] = "Cobol";
        
        System.out.println("Última posición de vocales: "+vocales[vocales.length-1]);
        System.out.println("Última posición de decimales: "+decimales[decimales.length-1]);
        System.out.println("Última posición de lenguajes: "+lenguajes[lenguajes.length-1]);
    
        System.out.println("Primera posición de lenguajes: "+lenguajes[0]);
    }
    
}
