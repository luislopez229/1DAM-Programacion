package CuentaCorriente;

/**
 *
 * @author luis
 */
public class CuentaCorriente {
    private int numero;
    private double saldo;
    
    public CuentaCorriente(){
        numero = (int) (Math.random()*1001);
        saldo = 0;
    }
    
    public CuentaCorriente(int numero){
        this.numero = numero;
        saldo = 0;
    }
    
    public CuentaCorriente(int numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void añadirDinero(int cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(int cantidad){
        saldo -= cantidad;
    }
}
