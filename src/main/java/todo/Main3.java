package todo;

public class Main3 {
    public static int M(int x){
        return x;
    }

    public static void main(String[] args) {
     Main3 m=new Main3();
     m.M(12);
        System.out.println(m.M(13));
        System.out.println(Main3.M(14));
    }
}
