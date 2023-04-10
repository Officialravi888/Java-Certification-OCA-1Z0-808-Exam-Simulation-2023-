package startpracticetest6exam6.exe1.exe28;


class Base{
    int id=1000;
    Base(){
        Base();
    }
   void Base(){
        System.out.println(++id);
    }
}
class Derived extends Base{
    int id=2000;
    Derived(){

    }
    void Base() {
        System.out.println(--id);
    }
}
public class Test {
    public static void main(String[] args) {
        Base b=new Derived();
      //  b.Base();

    }
}
