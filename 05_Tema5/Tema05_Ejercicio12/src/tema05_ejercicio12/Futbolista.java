package tema05_ejercicio12;

/**
 *
 * @author Luis
 */
public class Futbolista extends EmpleadoPrimable {
    private int dorsal;
    public Futbolista(String n, double s, int d){
        super(n,s);
        this.dorsal = d;
    }
}
