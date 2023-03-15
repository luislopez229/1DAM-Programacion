package tema05_ejercicio09;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis
 */
public class Programador extends TrabajadorTecleante{
    private Map<String,String> lenguajes;
    
    public Programador(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
        this.lenguajes = new HashMap<>();
    }
    
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        this.lenguajes.put(lenguaje, holaMundo);
    }
    
    public String programarHolaMundo(String lenguaje) throws IllegalStateException{  
        if(this.lenguajes.containsKey(lenguaje)){
            return this.lenguajes.get(lenguaje);
        }else{
            throw new IllegalStateException("No existe ese lenguaje");
        }
    }
}
