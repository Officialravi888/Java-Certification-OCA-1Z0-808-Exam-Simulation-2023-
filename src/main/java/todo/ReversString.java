package todo;

public class ReversString {
 public static String retur(String str){
    return new StringBuilder(str).reverse().toString();
 }

    public static void main(String[] args) {
        System.out.println(retur("Rvi kant"));
    }
}
