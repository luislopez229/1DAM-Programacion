package ejercicio08;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua da1,da2;
        da1 = new DepositoAgua(15,20);
        da2 = new DepositoAgua(5, 20);
        
        System.out.println("ANTES: ");
        da1.dibujar();
        da2.dibujar();
        
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        System.out.println("DESPUÃ‰S: ");
        da1.dibujar();
        da2.dibujar();
        
    }
    
}
