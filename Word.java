
package ghada2022;
 
import java.util.Scanner;

public class Word {
 
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

        String s = input.next();

        int countU = 0, countL = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                countU++;
            } else {
                countL++;

            }

        }

        if (countU > countL) {
            System.out.print(s.toUpperCase());
        } else {
            System.out.print(s.toLowerCase());
        }

        System.out.println();
        
        
        
        
    }

}
