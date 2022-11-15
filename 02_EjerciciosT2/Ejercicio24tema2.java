package ejercicio24tema2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio24tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintWriter pw;
        try{
        pw = new PrintWriter("d:/frases.txt");
        System.out.println("Introduce una frase");
        String f1=new Scanner(System.in).nextLine();
        System.out.println("Introduce otra frase");
        String f2=new Scanner(System.in).nextLine();
        
        pw.println(f1);
        pw.println(f2);
        pw.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        }
    
}
