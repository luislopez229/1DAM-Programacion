package Oficina;
import Persona.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author luis
 */
public class Oficina {
    private String nombre;
    private ArrayList<Persona> trabajadores;
    
    public Oficina(String nombre){
    this.nombre = nombre;
    trabajadores = new ArrayList<>();
    }
    
    public Oficina(String nombre, int tipo){
    this.nombre = nombre;
        switch (tipo){
            case 1:{
                trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));
                break;
            }
            case 2:{
                trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));
                trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
            }
            
            case 3:{
                trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));
                trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
                trabajadores.add(new Persona("Ana Díaz Díaz",3333333,'P',1200,LocalDate.of(1985,5,21)));
            }
            
            default:{
                this.nombre = nombre;
                trabajadores = new ArrayList<>();
            }
        }
    }
    
    public Oficina(){
        this("Industrias DAW",3);
    }
}
