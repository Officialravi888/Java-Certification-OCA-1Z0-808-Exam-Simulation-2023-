package pre.Main;

public class Demo {
    int a;
    String b;
    public static void Demo1(int a, String b){
        System.out.println(b+"----"+a);
    }
    public void D(){
        System.out.println("---");
    }

    public static void main(String[] args) {
        Demo.Demo1(2,"Tom");
    }
}

