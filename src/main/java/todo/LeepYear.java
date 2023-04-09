package todo;

import java.util.Scanner;

public class LeepYear {
   static int n, i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Any No Put:");
        n= scanner.nextInt();

        if ((n%400==0)&&(n%100!=0)||(n%4==0))
            System.out.println("LeepYear:"+n);
        else
            System.out.println("Not leepyear:"+n);
        }
    }

