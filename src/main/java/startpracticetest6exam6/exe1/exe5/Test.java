package startpracticetest6exam6.exe1.exe5;

public class Test {
    public static void main(String[] args) {
        String str="Ravi";
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(str.contentEquals(stringBuilder));
        System.out.println((stringBuilder.equals(str)));
    }
}
