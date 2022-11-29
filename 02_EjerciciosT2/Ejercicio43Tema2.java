package ejercicio43tema2;

import java.text.NumberFormat;

/**
 *
 * @author luis
 */
public class Ejercicio43Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi=4*Math.atan(1);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(pi));
    }
    
}
