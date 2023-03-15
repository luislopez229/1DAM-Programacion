package tema05_ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Luis
 */
public class Hotel extends Edificio{
    private List<String> clientes = new ArrayList<>();
    private int maximo;
    
    public Hotel(String d, int np, int m) throws IllegalArgumentException{
        super(d,np);
        if(m >= 0){
        this.maximo = m;
        }else{
            throw new IllegalArgumentException("El máximo no puede ser negativo");
        }
    }
    
    public void añadirCliente(String c) throws IllegalStateException{
        
        if(clientes.size() < this.maximo){
        clientes.add(c);
        }else{
        throw new IllegalStateException("Se ha superado el máximo de clientes");
        }
    }
    
    public void retirarCliente(String c){
        if(clientes.contains(c)){
        clientes.remove(c);
        }else{
        throw new NoSuchElementException("No existe el cliente");
        }
    }
}
