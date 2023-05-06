 
package ghada2022;
 
import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k, n, w, sum = 0;

        k = input.nextInt();
        n = input.nextInt();
        w = input.nextInt();

        for (int i = 1; i <= w; i++) {
             
              sum += i * k;  
             
             

        }

        
        if (sum>n) {
          System.out.println(sum - n);  
        }else{System.out.println(0); }
        
         

    }

}
