package ejercicio3tema3;

/**
 *
 * @author luis
 */
public class Ejercicio3Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ale = 0;
        
        do{
        ale = (int) (Math.random() * 11);
            System.out.println(ale);
        }while(ale != 10);
    }
}
