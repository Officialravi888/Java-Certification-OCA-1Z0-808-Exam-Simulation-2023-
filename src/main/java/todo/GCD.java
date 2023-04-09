package todo;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1,n2,gcd;
        Scanner scr=new Scanner(System.in);
        System.out.println("first no");
        n1=scr.nextInt();
        System.out.println("second no");
        n2=scr.nextInt();
        while (n1%n2!=0){
            int remainder=n1%n2;
            n1=n2;
            n2=remainder;
        }
        gcd=n2;
        System.out.println("print gcd:"+gcd);
    }
}
