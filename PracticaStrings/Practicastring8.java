package practicastring8;

/**
 *
 * @author luis
 */
public class Practicastring8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="Luis Luis Lopez Molina";
        String [] ss=s.split(" ");
        
        ss[0] = ss[0].substring(0, 1);
        ss[1] = ss[1].substring(0, 1);
        
        System.out.println(ss[2] + " " + ss[3] + "," + ss[0] + "." + ss[1]);
    }
    
}
