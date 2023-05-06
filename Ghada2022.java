package ghada2022;

import java.util.HashSet;
import java.util.Scanner;

public class Ghada2022 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Who = input.next();
        
         
        int num = NumOfdistinctChar(Who);
         if (IsEven(num)) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

    public static boolean IsEven(int num) {

        return (num % 2 == 0);
    }

    public static int NumOfdistinctChar(String str) {

        HashSet<Character> s = new HashSet<>();//New Info

        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));

        }
        return s.size();

    }

}
