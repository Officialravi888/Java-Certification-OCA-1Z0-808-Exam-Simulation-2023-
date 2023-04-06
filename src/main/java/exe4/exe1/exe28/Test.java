package exe4.exe1.exe28;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) {
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}