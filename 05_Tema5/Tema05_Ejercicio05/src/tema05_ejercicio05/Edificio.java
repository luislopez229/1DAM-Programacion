package tema05_ejercicio05;

/**
 *
 * @author Luis
 */
public class Edificio {
    private String direccion;
    private int numeroPlantas;
    
    public Edificio(String d, int np){
        this.direccion = d;
        
        if(np >= 0){
        this.numeroPlantas = np;
        }
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public int getNumeroPlantas(){
        return this.numeroPlantas;
    }
}
