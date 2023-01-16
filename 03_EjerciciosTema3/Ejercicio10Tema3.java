package ejercicio10tema3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio10Tema3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        System.out.println("Introduce la ruta del .txt");
        String ruta = new Scanner(System.in).nextLine();
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while(br.ready()){
                System.out.println(br.readLine());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
