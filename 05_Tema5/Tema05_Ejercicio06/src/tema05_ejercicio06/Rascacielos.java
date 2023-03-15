package tema05_ejercicio06;

/**
 *
 * @author Luis
 */
public class Rascacielos extends Edificio{
    private int altura;
    
    public Rascacielos(String d, int np, int a) throws IllegalArgumentException {
        super(d, np);
        
        if(a < 0){
           IllegalArgumentException e = new IllegalArgumentException("La altura debe ser positiva");
           throw e;
        }
        
        this.altura = a;
    }
    
    public int getAltura(){
        return this.altura;
    }
}
