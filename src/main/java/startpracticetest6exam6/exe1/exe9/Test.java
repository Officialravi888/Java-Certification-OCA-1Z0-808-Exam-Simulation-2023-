package startpracticetest6exam6.exe1.exe9;

interface M{
    public static void log(){
        System.out.println("M");
    }
}
abstract class A{
    public static void log(){
        System.out.println("N");
    }
}
class MyClass extends A implements M{

}
public class Test {
    public static void main(String[] args) {
        A obj2=new MyClass();
        obj2.log();
        MyClass obj3=new MyClass();
        obj3.log();
    }

}
