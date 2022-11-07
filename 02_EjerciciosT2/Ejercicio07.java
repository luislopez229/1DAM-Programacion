package Ejercicio07;
import bpc.daw.objetos.*;

public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua da1;
        
        da1 = new DepositoAgua(15,50);
        da1.dibujar();
        
        //50 ---- 100
        //15 ---- x
        double porcentaje = (15 * 100)/50;
        System.out.println("Porcentaje ocupado: "+porcentaje+" %");
    }
    
}
