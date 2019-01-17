/*
 * @author alBo5ari
 */

package divisibility;
    import java.util.Scanner;


public class Divisibility {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        long input = sc.nextInt();
        
        if (input != 0) {
            
            System.out.println("The Number "+input+"  can be divided by :");
            
            for(int i = 1; i <= input; i++){
                
                if (input % i == 0)
                    System.out.print(i + ", ");
            }
        }
        
    }   
}
