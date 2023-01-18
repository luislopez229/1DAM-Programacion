package ejercicio5tema3;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio5Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Cuántas piezas se pueden cazar hoy?");
        int total = new Scanner(System.in).nextInt();
        
        int suma = 0;
        int cazadas = 0;
        boolean fin = false;
        
        System.out.println("--- Empezamos la caza");
        
        while(suma <= total && fin == false){
            System.out.println("Introduzca el número de piezas cazadas");
            cazadas = new Scanner(System.in).nextInt();
  
            suma = suma + cazadas;
            System.out.println("Usted lleva cazadas "+suma+" piezas"
                    + " de "+total+" posibles.");
            
            if(suma >= total){
                System.out.println("El número máximo de piezas ha "
                        + "sido excedido");
                fin = true;
            }
            
        }
    }
    
}
