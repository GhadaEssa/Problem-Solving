 
package ghada2022;
 
import java.util.Scanner;

public class BearAndBigbrother {
 
    public static void main(String[] args) {
         
        Scanner input=new Scanner(System.in);
        
        int a,b,count=0;
        
        a=input.nextInt();
        b=input.nextInt();
        
        while (a<=b) {
         a*=3;   
         b*=2; 
         count++;
        }
        
        
        System.out.println(count);
        
        
    }
    
}
