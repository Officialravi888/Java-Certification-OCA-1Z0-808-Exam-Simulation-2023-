package startpracticetest4exam4.exe5;

public class Test {
    public static void main(String[] args) {
    String arr[]={"abc", "TrUe", "false", null, "FALSE"};
    for (String a:arr)
        System.out.println(Boolean.valueOf(a)?"T":"F");
}
}
