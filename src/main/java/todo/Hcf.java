package todo;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        int a,b,i,hcf=0;
        Scanner scr=new Scanner(System.in);
        System.out.println("first no");
        a= scr.nextInt();
        System.out.println("second no");
        b=scr.nextInt();
        for (i=1;i<a||i<b;i++){
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        System.out.println("Hcf print No: "+hcf);
    }
}
