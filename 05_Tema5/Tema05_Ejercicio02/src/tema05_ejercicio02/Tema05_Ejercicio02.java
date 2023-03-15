package tema05_ejercicio02;

/**
 *
 * @author Luis
 */
public class Tema05_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Compras compra;
       compra = new Compras(100);
       
       try{
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       compra.registrarCompra(20);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
    
