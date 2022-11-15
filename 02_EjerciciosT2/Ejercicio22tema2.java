package ejercicio22tema2;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio22tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TarjetaCredito tc;
        tc = new TarjetaCredito(5000,1111);
        try{
            int saldo=tc.getSaldo(1111);
            System.out.println("Saldo de la tarjeta: "+saldo);
            
            System.out.println("Sacamos 2000 euros");
            tc.sacarDinero(2000, 1111);
            int saldo2=tc.getSaldo(1111);
            System.out.println("Saldo de la tarjeta: "+saldo2);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    
    }
}
