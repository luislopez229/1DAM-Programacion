package tema05_ejercicio03;

/**
 *
 * @author Luis
 */
public class Rectangulo {
    private int base;
    private int altura;
    private int area;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(int b){
        this.base = b;
    }

    public void setAltura(int a) {
        this.altura = a;
    }
    
    public int getArea(){
        this.area = this.base * this.altura; 
        return this.area;
    }
    
    public int getBase(){
        return this.base;
    }
    
    public int getAltura(){
        return this.altura;
    }
}
