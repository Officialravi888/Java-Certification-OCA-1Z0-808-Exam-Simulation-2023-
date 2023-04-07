package exe5.exe19;

public interface Test {
    default void log(){
        System.out.println("Ilog");
    }

}
abstract class log{
    public static void log(){
        System.out.println("log");
    }
}
class MyLogger extends log {
    public static void main(String[] args) {
        log();
    }

}