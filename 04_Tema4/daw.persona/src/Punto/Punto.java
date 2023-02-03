package Punto;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author luis
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        x = 0;
        y = 0;
    }
    
    public Punto(int x, int y){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (int)size.getWidth();
        int alto = (int)size.getHeight();
        
        if(x >= ancho || y >= alto){
            this.x = ancho;
            y = alto;
        }
        else{
            this.x = x;
            this.y = y;
        }
    }
    
    public Punto(Punto p){
        this.x = p.x/2;
        this.y = p.y/2;
    }
    
    public Punto(double angulo, double distancia){
        x = (int) (distancia * Math.cos(angulo));
        y = (int) (distancia * Math.sin(angulo));
    }
    
    @Override
    public String toString(){
        
        String aux;
        aux = "X: "+x+",Y: "+y;
        return aux;
    }
}
