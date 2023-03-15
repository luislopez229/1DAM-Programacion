package tema05ejercicio15;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Luis
 */
public class GeneradorContraseñasUnicas extends GeneradorContraseñas {
    private Set<String> contraseñasGeneradas;
    
    public GeneradorContraseñasUnicas(){
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    public GeneradorContraseñasUnicas(Random r){
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    public String generarContraseña(int longitud){
        String aux = super.generarContraseña(longitud);
        this.contraseñasGeneradas.add(aux);
        
        if(this.contraseñasGeneradas.contains(aux)){
            aux = super.generarContraseña(longitud);
        }
        return aux;
    }
    
    public String generarContraseña(){
        return generarContraseña(12);
    }
}
