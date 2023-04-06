package pre.Main;

public class ReversString {
    public static String revers(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(revers("Java"));
    }
}
