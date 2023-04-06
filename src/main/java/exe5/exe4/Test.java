package exe5.exe4;

public class Test {
    public static void main(String[] args) {
        String s1="COP";
        String s2="cop";
        System.out.println(s1.equals(s2));
        System.out.println( s1.length()==s2.length());
        System.out.println(s1.equals(s2.toUpperCase()));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println((s2.equals(s1.toUpperCase())));
        System.out.println(s1.contentEquals(s2));
    }
}
