package pre.Main;

public class Sum {
    public int sum(int x, int y){
        return (x+y);
    }
    public int sum(int x, int y, int z){
        return (x+y+z);
    }

    public static void main(String[] args) {
        Sum sum=new Sum();
        System.out.println(sum.sum(1,3));
        System.out.println( sum.sum(2,5,4));
    }
}
