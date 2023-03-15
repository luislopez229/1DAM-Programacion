package tema05_ejercicio12;

/**
 *
 * @author Luis
 */
public class CuerpoTecnico extends Empleado {
    private String puesto;
    public CuerpoTecnico(String n, double s, String p) {
        super(n, s);
        this.puesto = p;
    }
    
    public String getPuesto(){
        return this.puesto;
    }
}
