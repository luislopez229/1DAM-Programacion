package tema05_ejercicio12;

/**
 *
 * @author Luis
 */
public class EmpleadoPrimable extends Empleado{
    private boolean primado;
    public EmpleadoPrimable(String n, double s){
        super(n,s);
        this.primado = false;
    }
    
    public void primar(){
        this.primado = true;
    }
    
    public boolean esPrimado(){
        return primado;
    }
}
