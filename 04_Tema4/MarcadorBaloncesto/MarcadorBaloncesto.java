package MarcadorBaloncesto;

import java.time.LocalDate;

/**
 *
 * @author luis
 */

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    public MarcadorBaloncesto(String nL, String nV){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = LocalDate.now();
    }
    
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = f;
    }
    
    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate fecha){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        this.fecha = fecha;
    }
    
    public void añadirCanasta(char equipo, int puntos){
        if(equipo == 'L' && (puntos > 0 && puntos < 4)){
            puntosLocal += puntos;
        }
        
        if(equipo == 'V' && (puntos > 0 && puntos < 4)){
            puntosVisitante += puntos;
        }
    }
    
    public void reset(){
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "Nombre del equipo local: "+nombreLocal+", puntuación: "+puntosLocal;
        aux +="\nNombre del equipo visitante: "+nombreVisitante+", puntuación: "+puntosVisitante;
        aux +="\nFecha: "+fecha.toString();
        return aux;
    }
}
