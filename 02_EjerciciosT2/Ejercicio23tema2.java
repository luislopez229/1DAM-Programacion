package ejercicio23tema2;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio23tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TarjetaCredito tc;
        tc = new TarjetaCredito(1000,2222);
        try{
            
            System.out.println("Saldo de la tarjeta: "+tc.getSaldo(2222));
            
            System.out.println("Ingresamos 100 euros");
            tc.ingresarDinero(100);
            
            System.out.println("Saldo de la tarjeta: "+tc.getSaldo(2222));
            
            System.out.println("Retiramos 2800 euros");
           
            if(tc.sacarDinero(2800, 2222)==true){
            }else{
            System.out.println("Error en la retirada de dinero");
            }
            
            System.out.println("Saldo de la tarjeta: "+tc.getSaldo(2222));
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
        
    }
    
}
