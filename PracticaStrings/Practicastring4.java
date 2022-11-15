package practicastring4;

import java.util.Scanner;

public class Practicastring4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce la cadena");
        String s=new Scanner(System.in).nextLine();
        System.out.println("Introduce el n a sumar");
        int n=new Scanner(System.in).nextInt();
        
        char [] c=s.toCharArray();
        int numero=0;
        
       while(numero != c.length){
           int siguiente=c[numero]+n;
           char cs=(char)siguiente;
           c[numero] = cs;
           System.out.print(c[numero]);
           numero++;
       }
    }
    
}
