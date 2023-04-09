package todo;

public class Vaical {
    public static int M(int a){
        System.out.println(""+a);
        return a;
    }
//    public static int M(int b,int a){
//        System.out.println(a+""+b);
//        return a+4;
//
//    }

    public static void main(String[] args) {
        Vaical s=new Vaical();
        s.M(12);
        System.out.println(s.M(122));
        System.out.println(Vaical.M(13));
//        s.M(12,4);
//        System.out.println(Vaical.M(12,43));
    }
}
