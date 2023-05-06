  
package ghada2022;

import java.util.Scanner;

 
public class StonesOnTheTable {
 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), count = 0;

        String s = input.next();

        for (int i = 0; i < n - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }

        }

        System.out.println(count);

    }

}
