package todo;

import java.util.Scanner;

public class Swapno {
    public static void main(String[] args) {
    int a,b,temp=0;
    Scanner s=new Scanner(System.in);
        System.out.println("first no");
    a=s.nextInt();
        System.out.println("second no");
    b= s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("a value:"+a+ " value:"+b);
    }
}
