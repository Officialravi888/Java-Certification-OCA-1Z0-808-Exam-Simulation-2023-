package startpracticetest6exam6.exe1.exe11;

class Boss{
    String msg="Ravi";
}
class A extends Boss{
    String msg="ravi";
}
public class Test {
    public static void main(String[] args) {
    Boss b = new Boss();
    Boss b1 = new A();
    A obj1 = (A) b1;
    String text = b.msg + "-" + b1.msg + "-" + obj1.msg; //Line n6
        System.out.println(text);
}
}
