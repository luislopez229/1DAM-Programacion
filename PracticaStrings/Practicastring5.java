package practicastring5;
import java.util.*;
/**
 *
 * @author luis
 */
public class Practicastring5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="Dabale arroz a la zorra el abad";
        String res=s.replaceAll("\\s+","");
        res = res.toLowerCase();
        StringBuilder sb;
        sb = new StringBuilder(res);
        sb.reverse();
        
        if (sb.toString().equals(res)){
        System.out.println("Es palíndromo");
        }else{
        System.out.println("No es palíndromo");
        }

    }
    
}
