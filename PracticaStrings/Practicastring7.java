package practicastring7;

/**
 *
 * @author luis
 */
public class Practicastring7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hola muy buenos dias";
        char [] c = s.toCharArray();
        int numero=0;
        while (numero<=s.length()){
            char prueba = c[numero];
            c[numero]=c[numero + 1];
            c[numero + 1] = prueba;
            System.out.print(c[numero]);
            System.out.print(c[numero+1]);
            numero = numero + 2;
        }
        
    }
    
}
