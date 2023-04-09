package startpracticetest6exam6.exe1.exe3;

interface Blogger{
    default void blog()throws Exception{
        System.out.println("GENERIC");
    }
}
class TravelBlogger implements Blogger {
    public void blog() {
        System.out.println("TRAVEL");
    }
}
public class Test {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); //Line n1
        ((TravelBlogger)blogger).blog(); //Line n2
    }
}
