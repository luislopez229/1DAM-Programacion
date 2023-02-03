package Persona;
import DNI.DNI;
import java.time.LocalDate;
/**
 *
 * @author luis
 */
public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    public Persona(String n, DNI d, double s, LocalDate fn){
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;
    }
    
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = s;
        fechaNacimiento = fn;
    }
    
    public Persona(String n, DNI d){
        nombre = n;
        dni = d;
        sueldo = 900;
        fechaNacimiento = LocalDate.now();
        fechaNacimiento = fechaNacimiento.minusYears(20);
    }

    public Persona(String n, int numDNI, char letraDNI){
        nombre = n;
        dni = new DNI(numDNI,letraDNI);
        sueldo = 900;
        fechaNacimiento = LocalDate.now();
        fechaNacimiento = fechaNacimiento.minusYears(20);
    }
}
