package todo;

import java.util.Scanner;

//public class ReverNo {
//    public static void main(String[] args) {
//        int number,revers;
//        Scanner scanner=new Scanner(System.in);
//        number=scanner.nextInt();
//        if (number %2 !=0){
//            System.out.println("odd");
//        }else {
//            System.out.println("even");
//        }
//    }
//}
class ReverNo {
    public static void main(String[] args) {
        int n = 12345, revs = 0;
    while (n!=0){
            int remendir=n%10;
            revs=revs*10+remendir;
            n=n/10;
        }
        System.out.println(""+revs);
    }
}