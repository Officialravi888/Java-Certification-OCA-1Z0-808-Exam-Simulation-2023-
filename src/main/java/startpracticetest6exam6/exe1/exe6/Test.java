package startpracticetest6exam6.exe1.exe6;

public class Test {
    public static void main(String[] args) {
        int ctr = 100;
        one:
        for (int i = 0; i < 10; i++) {
            two:
            for (int j = 0; j < 7; j++) {
                three:
                while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}
