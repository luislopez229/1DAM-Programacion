package Cafetera;

/**
 *
 * @author luis
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int cm) {
        capacidadMaxima = cm;
        cantidadActual = cm;
    }

    public Cafetera(int cm, int ca) {
        if (ca >= cm) {
            ca = cm;
        }
        capacidadMaxima = cm;
        cantidadActual = ca;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int cm) {
        capacidadMaxima = cm;
    }

    public void setCantidadActual(int ca) {
        cantidadActual = ca;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int st) {
        if ((cantidadActual - st) >= 0) {
            cantidadActual = cantidadActual - st;
        } else {
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int ac) {
        if ((cantidadActual + ac) <= capacidadMaxima) {
            cantidadActual = cantidadActual + ac;
        } else {
            cantidadActual = capacidadMaxima;
        }
    }
}
