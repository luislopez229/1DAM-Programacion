package ejercicio25tema2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio25tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s;
        File f;
        f = new File("d:/frases.txt");
        
        try{
        
        s = new Scanner(f);
        System.out.println(s.nextLine());
        System.out.println(s.nextLine());
        s.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        
        }
    }
    
}
