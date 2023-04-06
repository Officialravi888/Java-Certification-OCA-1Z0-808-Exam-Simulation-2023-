package pre.Main;

public class Encap {
    String a;
    String b;
    Encap(String a,String b){
        this.a=a;
        this.b=b;
        System.out.println(a+""+b);
    }

    public static void main(String[] args) {
        Encap encap=new Encap("a","v");
        System.out.println(encap);
    }
}
