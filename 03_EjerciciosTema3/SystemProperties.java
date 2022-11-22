package pruebaos;

/**
 *
 * @author luis
 */
public class Pruebaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        System.out.println("\n      Información sobre el SO: ");
        System.out.println("\nNombre del SO: "+
                System.getProperty(nombreSO));
        System.out.println("Versión del SO: "+
                System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: "+
                System.getProperty(arquitecturaSO));
        System.out.println("Separador de archivos: "+
                System.getProperty("file.separator"));
        System.out.println("Directorio de clases de Java: "+
                System.getProperty("java.class.path"));
        System.out.println("Directorio de instalación de Java: "+
                System.getProperty("java.home"));
        System.out.println("Nombre del proveedor de JRE: "+
                System.getProperty("java.vendor"));
        System.out.println("URL del proveedor de JRE: "+
                System.getProperty("java.vendor.url"));
        System.out.println("Versión del JRE: "+
                System.getProperty("java.version"));
        System.out.println("Separador de líneas: "+
                System.getProperty("line.separator"));
        System.out.println("Separador de directorios: "+
                System.getProperty("path.separator"));
        System.out.println("Directorio activo del usuario: "+
                System.getProperty("user.dir"));
        System.out.println("Directorio principal del usuario: "+
                System.getProperty("user.home"));
        System.out.println("Nombre del usuario: "+
                System.getProperty("user.name"));
    }
    
}
