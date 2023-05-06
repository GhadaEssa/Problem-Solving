 
package ghada2022;
 
import java.util.Scanner;

public class ChatRoom {
 
    public static void main(String[] args) {
 

        Scanner input=new Scanner(System.in);
        
        String s=input.next(),k="hello";
        int count=0,j=0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i)==k.charAt(j)) {
               j++;
               count++;
            }
            
            if (count==5) {
               break; 
            }
        
        }




        if (count==5) {
            System.out.println("YES");  
        }
        else{System.out.println("NO");}





    }
    
}
