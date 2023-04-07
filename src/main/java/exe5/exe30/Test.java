package exe5.exe30;

import java.util.concurrent.locks.Lock;

class M{
    public void m(){
        System.out.println("---");
    }
}
class a extends M{
    @Override
    public void m() {
        super.m();
        System.out.println("-----");
    }
}
class b extends M{
    @Override
    public void m() {
        System.out.println("--------------");
    }
}
public class Test {
    public static void main(String[] args) {
        M ba=new b();
        ba.m();
    }
}
