package practicastring4;

/**
 *
 * @author luis
 */
public class Practicastring4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="prueba";
        char [] c=s.toCharArray();
        int numero=0;
        
       while(numero != c.length){
           int siguiente=c[numero]+1;
           char cs=(char)siguiente;
           c[numero] = cs;
           System.out.print(c[numero]);
           numero++;
       }
    }
    
}
