package exe5.exe10;

interface Counter{
    int Count=10;

}
public class Test {
    public static void main(String[] args) {
        Counter[]arr=new Counter[2];
        for (Counter c:arr){
            System.out.println(c);
        }
    }
}
