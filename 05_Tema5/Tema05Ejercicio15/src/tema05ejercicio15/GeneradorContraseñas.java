package tema05ejercicio15;

import java.util.Random;

/**
 *
 * @author Luis
 */
public class GeneradorContraseñas {
    private Random random;
    
    public GeneradorContraseñas(){
        this.random = new Random();
    }
    
    public GeneradorContraseñas(Random r){
        this.random = r;
    }
    
    public String generarContraseña(int longitud){
        StringBuilder sb = new StringBuilder(longitud);
        
            for(int x = 0; x<longitud ; x++){
            int aux = this.random.nextInt(2);
            if(aux == 0){
                sb.insert(x, (char) (48 + this.random.nextInt(9)));
            }
            if(aux == 1){
                sb.insert(x, (char) (65 + this.random.nextInt(25)));
            }
            if(aux == 2){
                sb.insert(x, (char) (97 + this.random.nextInt(25)));
            }
        }
            return sb.toString();
    }
    
    public String generarContraseña(){
        return generarContraseña(8);
    }
}

