package question.exe6;

public class Helper {
    static int Multiply(int a, int b){
        return a*b;
    }
    static String Multiply(double a, double b, int c, String d){
        return a*b*c+d;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(""+Helper.Multiply(2,3,4,"Ravi"));
        System.out.println(""+Helper.Multiply(12,3));
    }
}