package ejercicio20tema2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio20tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una ruta");
        String ruta=new Scanner(System.in).nextLine();
        File f;
        f = new File(ruta);
        if (f.exists() && f.isDirectory()){
            System.out.println("La ruta introducida corresponde a un directorio");            
        }
        
        if(f.exists() && f.isFile()){
            System.out.println("La ruta introducida es un archivo de tamaño "
                    + f.length()+" bytes. ¿Desea borrarlo(si/no)?"); 
        String respuesta=new Scanner(System.in).nextLine();
        
        if (respuesta.equalsIgnoreCase("si")){
            boolean prueba = f.delete();
            if (prueba == false){
                System.out.println("No se ha podido borrar");
            }
        }else{
            System.out.println("Borrado cancelado");
        }
        
        }
    
    }
    }
    
