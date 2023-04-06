package pre.Main;

public class Revers {
    public static void main(String[] args) {
        int num=1234567, reves=0;
        while (num!=0){
            int remainder=num%10;
            reves=reves*10+remainder;
            num=num/10;
        }
        System.out.println(reves);
    }
}
