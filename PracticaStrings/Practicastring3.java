package practicastring3;

/**
 *
 * @author luis
 */
public class Practicastring3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        String s="El diccionario";
        String [] ss=s.split(" ");
        int numero = 0;
        
        while(numero != ss.length){
            if(!ss[numero].endsWith("a") || !ss[numero].endsWith("b") || !ss[numero].endsWith("i") || !ss[numero].endsWith("o") || !ss[numero].endsWith("u")){
                ss[numero] = ss[numero].concat("us");
            }else{
                ss[numero] = ss[numero].substring(0,ss[numero].length()-1);
                ss[numero] = ss[numero].concat("us");
            }
        System.out.print(ss[numero]+" ");
        numero++;
        }
    }
    
    
}
