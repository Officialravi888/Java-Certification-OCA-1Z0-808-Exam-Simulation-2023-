package startpracticetest6exam6.exe1.exe8;

import exe4.exe1.exe25.B;

class Boss{
    public void log()throws NullPointerException{
        System.out.println("----");

    }
}
class A extends Boss{
    public void log()throws RuntimeException{
        System.out.println("-----------");
    }
}
public class Test {
    public static void main(String[] args) {
        Boss boss=new A();
        boss.log();
    }
}
