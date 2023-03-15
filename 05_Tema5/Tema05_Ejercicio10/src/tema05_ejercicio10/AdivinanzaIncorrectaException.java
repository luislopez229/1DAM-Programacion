package tema05_ejercicio10;

/**
 *
 * @author Luis
 */
public class AdivinanzaIncorrectaException extends AdivinanzaException {
    public AdivinanzaIncorrectaException(){
        super("La respuesta no es correcta");
    }
}
