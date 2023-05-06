
package ghada2022;
 
import java.util.Scanner;

public class StringTask {
 
    public static void main(String[] args) {
 
Scanner input=new Scanner(System.in);

String text=input.next();
String newText=text.toLowerCase();
String tempText;


         
        for (int i = 0; i < newText.length(); i++) {
              
            
            if (newText.charAt(i)=='o'||newText.charAt(i)=='a'||newText.charAt(i)=='e'||newText.charAt(i)=='u'||newText.charAt(i)=='y'||newText.charAt(i)=='i') {
                
                 continue;
        
        
            }
        
        
         System.out.print("."+newText.charAt(i));
        }
        



        



    }
    
}
