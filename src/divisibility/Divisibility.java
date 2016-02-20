
package divisibility;
import java.util.Scanner;

public class Divisibility {

    
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner keyboard =  new Scanner(System.in);
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        
        int n3 = n1 % n2;
        if (n3 == 0) {
            System.out.println("yes " + n1 + " is divisible by " + n2);         
            
        }else {
            System.out.println("no " + n1 + " is not divisible by " + n2);
        }
            
    }
    
}
