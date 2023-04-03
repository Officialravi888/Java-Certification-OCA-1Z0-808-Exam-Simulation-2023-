package startpracticetest2exam2.exe32;

abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

   protected void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}

