package ejercicio4tema3;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio4Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Eres mayor de edad? (si/no)");
        String resp = new Scanner(System.in).nextLine();
        
        boolean fin = false;
        
        while(fin == false){
            if (resp.equalsIgnoreCase("si")){
                System.out.println("El usuario es mayor de edad");
                fin = true;
            }else
                if(resp.equalsIgnoreCase("no")){
                    System.out.println("El usuario es menor de edad");
                    fin = true;
                }
                else{
                System.out.println("No le he entendido, responda otra vez");
                resp = new Scanner(System.in).nextLine();
                }
            
        }
    }
    
}
