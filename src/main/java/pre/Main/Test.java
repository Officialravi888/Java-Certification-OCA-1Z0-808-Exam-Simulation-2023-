package pre.Main;

public class Test {
    public void m1(){
        System.out.println("hay");
    }
    class T extends Test{
        @Override
        public  void m1(){
            super.m1();
            System.out.println("---------");
        }

    }

    public static void main(String[] args) {
        T test= (T) new Test();
        test.m1();
    }
}
