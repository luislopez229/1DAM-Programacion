package tema05_ejercicio11;

/**
 *
 * @author Luis
 */
public class Tema05_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e;
        e = new Empleado("josemi", 1000);
        
        try{
        e.cobrar(200);
        }catch(CabreoException ce){
            System.out.println(ce.getMessage());
        }
     }
    
}
