package startpracticetest6exam6.exe1.exe7;

public class Test {
    public static void div(int i, int j){
        try{
            System.out.println(i/j);
        }catch (ArithmeticException e){
            throw (RuntimeException )e;
        }
    }

    public static void main(String[] args) {
        try {
            div(0,5);
        }catch (ArithmeticException e){
            System.out.println("AE");
        }catch (RuntimeException e){
            System.out.println("RE");
        }
    }
}
