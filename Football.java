 
package ghada2022;

import java.util.Scanner;

 
public class Football {
 
    public static void main(String[] args) {
 
    Scanner input= new Scanner(System.in);

    String players=input.next();
    
    
        if (check(players)) {
                System.out.print("YES"); 
        } else {
       
            System.out.print("NO");
        }
     
    }
    
    
    
    public static boolean  check(String str) {
        int count=0,count2=0,i;
        
        for (int j = 0; j < str.length(); j++) {
                i=j;count=0;count2=0;
         while (i<str.length()&&str.charAt(i)=='0') {
            count++;i++;
        
        }
        while (i<str.length()&&str.charAt(i)=='1') {
            count2++;i++;
        
        }
        
            if (count2>=7 || count>=7) {
               return true; 
            }
        
        }
        
    
        return false;
    }
  
   
    
    
}
