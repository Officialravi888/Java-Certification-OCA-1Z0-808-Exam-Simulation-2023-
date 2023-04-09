package todo;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        int a,b,c,Largest,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("First no");
        a= s.nextInt();
        System.out.println("Second no");
        b= s.nextInt();
        System.out.println("third no");
        c= s.nextInt();
        temp=a>b?a:b;
        Largest=c>temp?c:temp;
        System.out.println("Largest no: "+Largest);
    }
}
