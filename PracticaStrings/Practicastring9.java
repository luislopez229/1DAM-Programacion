package practicastring9;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Practicastring9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce la primera frase");
        String s1=new Scanner(System.in).nextLine();
        System.out.println("Introduce la segunda frase");
        String s2=new Scanner(System.in).nextLine();
        s1=s1.replaceAll("\\s+","");
        s2=s2.replaceAll("\\s+","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char [] c1= s1.toCharArray();
        char [] c2=s2.toCharArray();
        
        Arrays.sort(c1,0,c1.length);
        Arrays.sort(c2,0,c2.length);
       
        String s11=Arrays.toString(c1);
        String s22=Arrays.toString(c2);
        
        System.out.println(s11);
        System.out.println(s22);
        if(s11.equals(s22)){
            System.out.println("Son anagramas");
        }else{
            System.out.println("No son anagramas");
        }
    }
    
}
