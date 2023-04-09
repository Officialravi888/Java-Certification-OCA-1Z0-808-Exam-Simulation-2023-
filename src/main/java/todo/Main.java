package todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, gcd = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("first no");
        n1=scanner.nextInt();
        System.out.println("second no");
        n2=scanner.nextInt();

        for(int i = 1; i <= n1 && i <= n2; ++i) {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }
}

