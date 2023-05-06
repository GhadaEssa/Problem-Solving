package ghada2022;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long number = input.nextLong();
        int num=isLucky(number);
        
        if (num== 7 || num == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int isLucky(long number) {
          
        int a=0;
        while (number != 0) {

            if (number % 10 == 7 || number % 10 == 4) {
                          a++;
                

            }

            number /= 10;

        }
        
        return a;
    }

}
