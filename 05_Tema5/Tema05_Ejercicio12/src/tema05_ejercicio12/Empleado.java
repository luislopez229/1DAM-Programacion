package tema05_ejercicio12;

/**
 *
 * @author Luis
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    private double dinero = 0;
    
    public Empleado(String n, double s){
        this.nombre = n;
        this.sueldo = s;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public double getDinero(){
        return this.dinero;
    }
    
    public void cobrar(double cantidad) throws CabreoException{
        if(cantidad < getSueldo()){
            this.dinero += cantidad;
            throw new CabreoException("Al empleado "+this.nombre+" no"
                    + " se le han pagado "+this.sueldo+" euros");
        }else{
            this.dinero += cantidad;
        }
    }
}
