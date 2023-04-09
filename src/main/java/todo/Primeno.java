package todo;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Put no");
        n=sc.nextInt();
        if (n==1){return;
        }
        for (i=2; i<n; i++){
            if(n%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("prime no");

    }
}
