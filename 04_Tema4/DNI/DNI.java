package DNI;

/**
 *
 * @author luis
 */
public class DNI {
    private int numero;
    private char letra;
    
    public DNI(int n, char l){
        numero = n;
        letra = l;
    }
    
    public DNI(String DNI){
        String num = DNI.substring(0,8);
        char let = DNI.charAt(DNI.length()-1);
        
        numero = Integer.parseInt(num);
        letra = let;
        
    }
}
