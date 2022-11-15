package ejercicio28tema2;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio28tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un nombre de equipo:");
        String nom = new Scanner(System.in).nextLine();
        
        
         
        try{
      InetAddress ia = InetAddress.getByName(nom);
        System.out.println("La IP de "+nom+" es "+ia.getHostAddress());
        
        }catch(UnknownHostException e){
        System.out.println(e.getMessage());
        }
    }
    
}
