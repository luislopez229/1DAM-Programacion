package tema05_ejercicio10;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Luis
 */
public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;
    
    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
    }
    
    public String getEnunciado(){
        this.inicio = Instant.now();
        return this.enunciado;
    }
    
    public void comprobar(String respuesta) throws AdivinanzaIncorrectaException,TiempoSuperadoException{
        Instant ahora = Instant.now();
        
        Duration tiempo = Duration.between(inicio, ahora);
        if(tiempo.getSeconds() >= 30){
            throw new TiempoSuperadoException();
        }else{
            if(!respuesta.equals(this.respuestaCorrecta)){
                throw new AdivinanzaIncorrectaException();
            }else{
                System.out.println("CORRECTO");
            }
        }
    }
}
