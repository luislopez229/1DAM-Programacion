package tema05_ejercicio09;

/**
 *
 * @author Luis
 */
public class TrabajadorTecleante extends Trabajador {
    
    private int pulsacionesMinuto;
    
    public TrabajadorTecleante(String nombre, int sueldo, int numDNI, char letraDNI, int ppm) {
        super(nombre, sueldo, numDNI, letraDNI);
        this.pulsacionesMinuto = ppm;
    }
    
    public int getPulsacionesMinuto(){
        return pulsacionesMinuto;
    }
}
