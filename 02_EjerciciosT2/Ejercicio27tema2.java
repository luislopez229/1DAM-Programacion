package ejercicio27tema2;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio27tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba una dirección IP");
        String ip = new Scanner(System.in).nextLine();
        System.out.println("Escriba el tiempo de timeout (en milisegundos)");
        int timeout = new Scanner(System.in).nextInt();
        
        InetAddress ia = null;
        try{
        ia = ia.getByName(ip);
            try {
                boolean resp = ia.isReachable(timeout);
                System.out.println("Haciendo ping a "+ip+"... "+resp);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }catch(UnknownHostException e){
        System.out.println(e.getMessage());
        }
      }
    
}
