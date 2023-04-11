package startpracticetest6exam6.exe1.exe37;

import static startpracticetest6exam6.exe1.exe7.Test.div;

public class Test {
    public void add(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            throw (RuntimeException)e;
        }
    }

    public static void main(String[] args) {
            try {
                div(5,0);
            }catch (ArithmeticException e){
                System.out.println("AE");
            }catch (RuntimeException e){
                System.out.println("RE");
            }
    }

}
