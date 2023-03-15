package tema05_ejercicio02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Compras {
    private double presupuesto;
    private List<Double> precios;
    private double sumatoria = 0;
    
    public Compras(double presupuesto){
        this.presupuesto = presupuesto;
        this.precios = new ArrayList<>();
    }
    
    public void registrarCompra(double dinero) throws Exception{
        
        for(double x : precios){
            sumatoria += x;
        }
        
        if(sumatoria + dinero < this.presupuesto){
            this.precios.add(dinero);
        }else{
            Exception e = new Exception("Se ha sobrepasado el presupuesto");
            throw e;
        }
        
        sumatoria = 0;
    }
}
