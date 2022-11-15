package practicastring2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Practicastring2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un string de máximo 50 caracteres");
        String s = new Scanner(System.in).nextLine();
        
        if(s.length()<=50){
            
            String res=s.replaceAll("\\s+","");
            System.out.println(res);
        }else{
        System.out.println("Se ha superado el máximo");
            
        }
    }
    
}
