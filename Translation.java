 
package ghada2022;
 
import java.util.Scanner;

public class Translation {
 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        String s=input.next(),t=input.next();
         
        if (check(s,t)) {
            System.out.println("YES"); 
        }
        else
        {
            System.out.println("NO");
        }
        
    }
    
    
    public static boolean check(String s, String t) {

        int i,j=0;
        for (i = s.length() - 1,j=0; i >= 0; i--,j++) {
            
                    System.out.println(s.charAt(i)+"-"+t.charAt(j));
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
              
            

        }

        return true;

    }
}

