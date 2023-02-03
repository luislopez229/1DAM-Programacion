package Caja;

/**
 *
 * @author luis
 */
public class Caja {

    private boolean abierto;
    private String mensaje;
    
    public Caja(String m){
    abierto = false;
    mensaje = m;
    }
    
    public Caja(boolean a, String m){
    abierto = a;
    mensaje = m;
    }
    
    public Caja(){
    abierto = false;
    mensaje = "Viva el Tema 7";
    }
    
    public void setMensaje(String m){
        if(abierto)
            mensaje = m;
    }
    
    public void pasarMayusculas(){
        mensaje = mensaje.toUpperCase();
    }
}
